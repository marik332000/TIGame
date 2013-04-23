package tigame.gui;

import java.awt.event.KeyEvent;

public class KeyCode {
	public static char decode(int keycode, boolean shift) {
		switch(keycode) {
			case KeyEvent.VK_SPACE: return ' ';
			case KeyEvent.VK_TAB: return ' ';
			case KeyEvent.VK_MINUS: return '-';
			case KeyEvent.VK_SEMICOLON: return ':';
			case KeyEvent.VK_EQUALS: return shift? '+':'=';
			case KeyEvent.VK_8: return shift? '*' : '8';
			case KeyEvent.VK_SLASH: return shift? '?' : '/';
			case KeyEvent.VK_QUOTE: return '"';
			case KeyEvent.VK_COMMA: return shift? '<' : ',';
			case KeyEvent.VK_PERIOD: return shift? '>' : '.';
			default:
				String s = KeyEvent.getKeyText(keycode);
				if( s.length() == 1 ) {
					return s.charAt(0);
				}
				return '\0';
		}
	}
}
