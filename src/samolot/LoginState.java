package samolot;

import java.awt.Font;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.gui.TextField;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
/**
 * Klasa wykonujaca sie w momencie wlaczenia przez uzytkownika gry - panel logowania
 * @author Kamila Wasilewska
 */
public class LoginState extends BasicGameState {
	/** Czcionka podstawowa */
	private Font font;
	/** Czcionka bitmapowa, ktora moze wyswietlac znaki unicode */
	private UnicodeFont uniFont;
	/** Tekst informujacy o mozliwosci wpisania nazwy uzytkownika */
	private String text;
	/** Pole tekstowe do wprowadzania  nazwy uzytkownika */
	private TextField login;
	
	public LoginState() {
		super();
	}

	/** Inicjowanie klasy LoginState */
	@SuppressWarnings("unchecked")
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		font = new Font("Arial Black", Font.PLAIN, 28);
		uniFont = new UnicodeFont((font), 28, false, false);
		uniFont.addAsciiGlyphs();
		uniFont.addGlyphs(0x000, 0x017F);
		uniFont.getEffects().add(new ColorEffect());
		uniFont.loadGlyphs();
		login = new TextField(gc, uniFont, 320, 650, 640, 50);
		text = "Podaj swoje imiê i naciœnij klawisz ENTER:";
	}
	
	/** Aktualizowanie logiki gry */
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int t) throws SlickException {
		if(gc.getInput().isKeyPressed(Input.KEY_ENTER)) {
			LoadingState.username = login.getText();
			sbg.enterState(1, new FadeOutTransition(), new FadeInTransition());
		}
	}
	
	/** Renderowanie ekranu gry */
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		LoadingState.background.draw(0, 0, Color.gray);
		LoadingState.logo.draw(gc.getWidth()/2-LoadingState.logo.getWidth()/2, gc.getHeight()/4-LoadingState.logo.getHeight()/2);
		login.setFocus(true);
		login.setCursorVisible(false);
		login.render(gc, g);
		uniFont.drawString(gc.getWidth()/2-uniFont.getWidth(text)/2, gc.getHeight()/2+uniFont.getHeight(text), text, Color.white);
	}

	/** Przypisanie numeru identyfikacyjnego klasie LoginState */
	@Override
	public int getID() {
		return 0;
	}
}
