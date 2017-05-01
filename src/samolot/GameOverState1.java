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
 * Klasa bedaca stanem konca gry dla poziomu drugiego
 * @author Kamila Wasilewska
 */
public class GameOverState1 extends BasicGameState {
	/** Tekst informujacy o ilosci zdobytych punktow w poziomie pierwszym */
	private String score;
	/** Tekst informujacy o ilosci zdobytych punktow w poziomie drugim */
	private String score1;
	
	public GameOverState1() {
		super();
	}

	/** Inicjowanie klasy GameOverState1 */
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
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
		g.setColor(Color.white);
		score = "Punkty uzyskane w poziomie pierwszym: " + LoadingState.points1;
		score1 = "Punkty uzyskane w poziomie drugim: " + LoadingState.points2;
		LoadingState.gameover.draw(gc.getWidth()/2-LoadingState.gameover.getWidth()/2, LoadingState.gameover.getHeight());
		LoadingState.uniFont.drawString(gc.getWidth()/2-LoadingState.uniFont.getWidth(LoadingState.gameOverText)/2, 
				gc.getHeight()/1.1f+LoadingState.uniFont.getHeight(LoadingState.gameOverText), LoadingState.gameOverText);
		LoadingState.uniFont.drawString(gc.getWidth()/2-LoadingState.uniFont.getWidth(LoadingState.gameOverText1)/2, 
				gc.getHeight()/2-2*LoadingState.uniFont.getHeight(LoadingState.gameOverText1), LoadingState.gameOverText1);
		LoadingState.uniFont.drawString(gc.getWidth()/2-LoadingState.uniFont.getWidth(LoadingState.gameOverText2)/2, 
				gc.getHeight()/2-LoadingState.uniFont.getHeight(LoadingState.gameOverText2), LoadingState.gameOverText2);
		LoadingState.uniFont.drawString(gc.getWidth()/2-LoadingState.uniFont.getWidth(score)/2, gc.getHeight()/2, score);
		LoadingState.uniFont.drawString(gc.getWidth()/2-LoadingState.uniFont.getWidth(score1)/2,
				gc.getHeight()/2+LoadingState.uniFont.getHeight(score1), score1);
	}
	
	/** Przypisanie numeru identyfikacyjnego klasie GameOverState1 */
	@Override
	public int getID() {
		return 51;
	}
}