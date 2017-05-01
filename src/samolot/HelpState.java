package samolot;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
/**
 * Klasa wykonujaca sie w momencie wybrania przez uzytkownika opcji pomocy
 * @author Kamila Wasilewska
 */
public class HelpState extends BasicGameState {
	/** Informacja o mozliwosci powrocenia do poprzedniego ekranu */
	private String text;
	
	public HelpState() {
		super();
	}

	/** Inicjowanie klasy HelpState */
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		text = "Naciœnij ENTER, aby powróciæ do poprzedniego ekranu";
	}

	/** Aktualizowanie logiki gry */
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int t) throws SlickException {
		if(gc.getInput().isKeyPressed(Input.KEY_ENTER)) {
			sbg.enterState(1, new FadeOutTransition(), new FadeInTransition());
		} 
	}
	
	/** Renderowanie ekranu gry */
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		LoadingState.background.draw(0, 0, Color.gray);
		LoadingState.help.draw(gc.getWidth()/2-LoadingState.help.getWidth()/2, LoadingState.help.getHeight());
		LoadingState.help2.draw(gc.getWidth()/2-LoadingState.help2.getWidth()/2, LoadingState.help2.getHeight()/3);
		LoadingState.uniFont.drawString(gc.getWidth()/2-LoadingState.uniFont.getWidth(text)/2, gc.getHeight()/1.1f+LoadingState.uniFont.getHeight(text), text, Color.white);
	
	}
	
	/** Przypisanie numeru identyfikacyjnego klasie HelpState */
	@Override
	public int getID() {
		return 2;
	}
}