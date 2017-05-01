package samolot;

import java.util.ArrayList;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Ellipse;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
/** 
 * Klasa generujaca ekran wyniku otrzymanego w poziomie drugim
 * @author Kamila Wasilewska
 */
public class ScoreState2 extends BasicGameState {
	/** Tekst informujacy o ilosci zdobytych punktow w poziomie drugim */
	private String score;
	
	public ScoreState2() {
		super();
	}

	/** Inicjowanie klasy ScoreState2 */
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		
	}

	/** Aktualizowanie logiki gry */
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int t) throws SlickException {
		if (gc.getInput().isKeyPressed(Input.KEY_ENTER)) {
			LoadingState.levelTime = 60000;
			LoadingState.timePassed = 0;
			LoadingState.yPlane = 10;
			LoadingState.xBackground = 0;
			LoadingState.xBackground2 = 0;
			LoadingState.clouds = new ArrayList<Ellipse>();
			sbg.enterState(12, new FadeOutTransition(), new FadeInTransition());
		}
	}
	
	/** Renderowanie ekranu gry */
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		LoadingState.background.draw(0, 0, Color.gray);
		g.setColor(Color.white);
		LoadingState.uniFont.drawString(gc.getWidth()/2-LoadingState.uniFont.getWidth(LoadingState.username)/2, gc.getHeight()/2-LoadingState.uniFont.getHeight(LoadingState.username), LoadingState.username);
		score ="Twój wynik: " + LoadingState.points2;
		LoadingState.uniFont.drawString(gc.getWidth()/2-LoadingState.uniFont.getWidth(score)/2, gc.getHeight()/2, score);
		LoadingState.uniFont.drawString(gc.getWidth()/2-LoadingState.uniFont.getWidth(LoadingState.scoreText)/2, gc.getHeight()/2+LoadingState.uniFont.getHeight(LoadingState.scoreText), LoadingState.scoreText);
	}
	
	/** Przypisanie numeru identyfikacyjnego klasie ScoreState2 */
	@Override
	public int getID() {
		return 31;
	}
}