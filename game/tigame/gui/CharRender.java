package tigame.gui;

import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class CharRender {
	private BufferedImage font;
	private int width;
	private int height;
	private int left_pad;
	private BufferedImage letters[];
	private String text;
	public CharRender() {
		width = 3;
		height= 5;
		left_pad = 1;
		try {
			font = ImageIO.read(new File("font2.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		text = "abcdefghijklmnopqrstuvwxyz0123456789:\",()<>[]{}+-/_?'^\\.;~=* ";
		letters = new BufferedImage[font.getWidth()/(width+left_pad)];
		for(int i=0; i<letters.length; i++) {
			letters[i] = font.getSubimage(i*(width+left_pad)+left_pad, 0, width, height);
		}
	}
	public BufferedImage getLetter(char c) {
		c = Character.toLowerCase(c);
		int index = text.indexOf(c);
		if( index == -1  || index >= letters.length) return null;
		return letters[index];
	}
	public void drawLetter(Screen s, char ch, int x, int y) {
		drawLetter(s,ch,x,y,3);
	}
	public void drawLetter(Screen s, char ch, int x, int y, int shade) {
		BufferedImage letter = getLetter(ch);
		if(letter == null) return;
		for(int r=0; r<letter.getHeight(); r++) {
			for(int c=0; c<letter.getWidth(); c++) {
				if((0xFFFFFF&letter.getRGB(c,r)) < 0xAAAAAA) {
					s.setPixel(x+c, y+r, shade);
				}
			}
		}
	}
	public boolean isLegal(char c) {
		return text.indexOf(Character.toLowerCase(c)) != -1;
	}
	public void drawString(Screen s, String str, int x, int y) {
		drawString(s, str, x, y, 3);
	}
	public void drawString(Screen s, String str, int x, int y, int shade) {
		for(int j=0; j<str.length(); j++) {
			drawLetter(s, str.charAt(j), (width+left_pad)*j+x, y, shade);
		}
	}
}
