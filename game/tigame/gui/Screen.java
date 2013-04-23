package tigame.gui;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.Dimension;

public class Screen extends Canvas {
	final private int pixels[];
	final private BufferedImage img;
	final private CharRender letters;

	final private int width;
	final private int height;
	final private int scale;
	final private int gray[] = {
		0xaaba93,  // white
		0x779766, // lightgray
		0x445522, // darkgray
		0x102000 // black
	};
	public Screen() {
		this(4);
	}
	public Screen(int scale) {
		super();

		this.scale = scale;
		this.width = 96;
		this.height = 64;
		this.pixels = new int[(width*scale)*(height*scale)];
		for(int i=0; i < pixels.length; i++) {
			pixels[i] = gray[0];
		}
		this.img = new BufferedImage(width*scale, height*scale, BufferedImage.TYPE_INT_RGB);

		this.setPreferredSize(new Dimension(width*scale, height*scale));
		letters = new CharRender();
	}
	public void update(Graphics g) {
		paint(g);
	}
	public void paint(Graphics g) {
		g.drawImage(img,0,0,null);
		g.dispose();
	}
	public void fill(int shade) {
		if( shade < 0  || shade >= gray.length) {
			return;
		}
		for(int i=0; i<pixels.length; i++) {
			pixels[i] = gray[shade];
		}
	}
	public void setPixel(int x, int y, int shade) {
		if(x < 0 || x >= width) return;
		if(y < 0 || y >= height) return;
		if( shade < 0 || shade >= gray.length) return;
		for(int ii=0; ii<scale; ii++) {
			for(int jj=0; jj<scale; jj++) {
				pixels[(x*scale+ii)+(y*scale+jj)*(width*scale)]=gray[shade];
			}
		}
	}
	public int getPixel(int x, int y) {
		if(x < 0 || x >= width) return -1;
		if(y < 0 || y >= height) return -1;
		int val = pixels[x*scale+ (y*scale)*(width*scale)];
		for(int shade=0; shade<4; shade++) {
			if( gray[shade] == val ) {
				return shade;
			}
		}
		return -1;
	}
	public void draw() {
		img.setRGB(0,0,scale*width, scale*height, pixels, 0, scale*width);
		repaint();
	}
	public void drawString(String s, int x, int y) {
		drawString(s, x, y,3);
	}
	public void drawString(String s, int x, int y, int shade) {
		letters.drawString(this, s, x, y, shade);
	}
	public boolean isLegal(char ch) {
		return letters.isLegal(ch);
	}
	public static void main(String[] args) throws Exception {
		Screen screen = new Screen();
		JFrame frame = new JFrame();
		frame.getContentPane().add(screen);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Thread.sleep(1000);
		int i=0;
		while(true) {
			screen.fill(i);
			screen.setPixel(20,20,3);
			screen.setPixel(10,10,2);
			screen.setPixel(5,5,1);
			screen.setPixel(0,0,0);
			String test = "Hello? \"John\"";
			screen.letters.drawString(screen, test, 30,30);
			screen.draw();
			Thread.sleep(1000);
			i++;
			if( i >= 4) i=0;
		}
	}
}
