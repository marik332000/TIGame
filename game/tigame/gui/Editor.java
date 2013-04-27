package tigame.gui;

import java.awt.event.KeyEvent;

public class Editor implements IContext {
	private int cols;
	private int rows;
	private char buffer[][];
	private int length[];
	private int row;
	private int col;

	private int shift;

	private int viewbase;

	private int max_rows = 10000;

	private int mode;
	final private int INSERT=0;
	final private int REPLACE=1;

	private boolean cursor_blink;

	private Screen screen;

	public Editor(Screen s) {
		cols = 96/4-1;
		rows = 1;
		buffer = new char[max_rows+20][cols];
		length = new int[max_rows+20];
		row = 0;
		col = 0;

		viewbase = 0;

		mode = INSERT;

		shift = 0;

		screen = s;

		cursor_blink = true;

		new Thread() {
			public void run() {
				while(true) {
					try {
						Thread.sleep(1000);
						cursor_blink = !cursor_blink;
					} catch(InterruptedException e){
					}

				}
			}
		}.start();
	}
	public void setText(String s) {
		cols = 96/4-1;
		rows = 1;
		buffer = new char[max_rows+20][cols];
		length = new int[max_rows+20];
		row = 0;
		col = 0;

		viewbase = 0;

		mode = INSERT;

		shift = 0;

		String lines[] = s.split("\n");
		for(int i=0; i<lines.length; i++) {
			String line = lines[i].trim();
			for(int j=0; j<line.length(); j++) {
				if(screen.isLegal(line.charAt(j))) {
					insert(line.charAt(j));
				}
			}
			insertRow();
			down();
		}
	}
	public String getText() {
		String text="";
		for(int r=0; r<rows; r++) {
			String str = new String(buffer[r]);
			str = str.substring(0,length[r]);
			text += str + "\n";
		}
		text = text.trim()+"\n";
		text = text.toLowerCase();
		System.err.println(text);
		return text;
	}
	public void insert(char ch) {
		switch(mode) {
			case INSERT:
				int len = cols - (col + 1);
				System.arraycopy(buffer[row], col, buffer[row], col+1, len);
				buffer[row][col] = ch;
				length[row]++;
				right();
				break;
			case REPLACE:
				buffer[row][col] = ch;
				right();
				length[row]++;
				break;
		}
	/*	if( row+1 == rows ) {
			row++;
			insertRow();
			row--;
		} */
	}
	public void delete() {
		if(length[row] > 0) {
			int len = cols - (col + 1);
			System.arraycopy(buffer[row], col+1, buffer[row], col, len);
			buffer[row][cols-1] = ' ';
			length[row]--;
		}
	}
	public void right() {
		if( col+1 >= cols || col+1>length[row] ) return;
		col++;
	}
	public void left() {
		if( col-1 < 0 ) return;
		col--;
	}
	public void up() {
		if( row-1 >= 0 ) {
			row--;
			col=length[row];
			if(viewbase > row) {
				viewbase = row;
			}
		}
	}
	public void down() {
		if( row+1 < rows ) {
			row++;
			col=length[row];
			if(viewbase+8 < row ) {
				viewbase = row-8;
			}
		}
	}
	public void insertRow() {
		if( rows+1 < max_rows ) {
			rows++;
			for(int r=rows-1; r>row+1; r--) {
				System.arraycopy(buffer[r-1], 0, buffer[r], 0, cols);
				length[r] = length[r-1];
			}
			buffer[row+1][0]=' ';
			length[row+1] = 0;
		}
	}
	public void deleteRow() {
		if( rows > 1 ) {
			rows--;
			for(int r=row; r<rows; r++) {
				System.arraycopy(buffer[r+1], 0, buffer[r], 0, cols);
				length[r] = length[r+1];
			}
			length[rows] = 0;
		}
	}

	public void draw() {
		String row_str;
		if( cursor_blink ) {
			char tmp = buffer[row][col];
			buffer[row][col] = (mode==INSERT? '_' : '~' );
			row_str = new String(buffer[row]);
			buffer[row][col] = tmp;
		} else {
			row_str = new String(buffer[row]);
		}
		screen.fill(0);

		screen.drawString("S",93,59,shift);

		for(int r = viewbase; r<viewbase+10; r++) {
			String str;
			if( r == row ) {
				str = row_str;
			}
			else {
				str = new String(buffer[r]);
			}
			if( r == row && col == length[r] ) {
				str = str.substring(0,length[r]+1);
			}
			else {
				str = str.substring(0,length[r]);
			}
			//System.out.println(str);
			screen.drawString(str, 2, (r-viewbase)*6+2);
		}
		screen.draw();
	}

	public void step() {
	}
	public void halt() { }
	public void keyPressed(int keycode) {
		switch( keycode ) {
			case 0:
				break;
			case KeyEvent.VK_BACK_SPACE:
				left();
				delete();
				if(length[row] == 0) {
					deleteRow();
					up();
				}
				break;
			case KeyEvent.VK_ENTER:
				insertRow();
				down();
				break;
			case KeyEvent.VK_TAB:
				insert(' ');
				insert(' ');
				break;
			case KeyEvent.VK_DELETE:
				delete();
				break;
			case KeyEvent.VK_LEFT:
				left();
				break;
			case KeyEvent.VK_UP:
				up();
				break;
			case KeyEvent.VK_RIGHT:
				right();
				break;
			case KeyEvent.VK_DOWN:
				down();
				break;
			case KeyEvent.VK_SHIFT:
				shift = (shift+1) % 3;
				break;
			case KeyEvent.VK_BACK_QUOTE:
				if( mode==INSERT ) {
					mode = REPLACE;
				}
				else {
					mode = INSERT;
				}
			default:
				char ch = KeyCode.decode(keycode, shift>0);
				if( screen.isLegal(ch) ) {
					insert(ch);
				}
				if( shift == 1 ) shift = 0;
		}
	}
}
