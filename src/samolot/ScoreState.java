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
 * Klasa generujaca ekran ostatnich wynikow
 * @author Kamila Wasilewska
 */
public class ScoreState extends BasicGameState {
	/** Tekst informujacy o ilosci zdobytych punktow w poziomie pierwszym */
	private String score;
	/** Tekst informujacy o ilosci zdobytych punktow w poziomie drugim */
	private String score1;
	/** Tekst informujacy o ilosci zdobytych punktow w poziomie trzecim */
	private String score2;
	/** Tekst informujacy o ilosci zdobytych punktow we wsystkich poziomach */
	private String totalScore;
	/** Tekst informujacy o mozliwosci przejscia do menu glownego za posrednictwem klawisza enter */
	private String scoreText;
	
	public ScoreState() {
		super();
	}

	/** Inicjowanie klasy ScoreState */
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		scoreText = "Naciœnij ENTER, aby przejœæ do MENU g³ównego";
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
		score = "Punkty uzyskane w poziomie pierwszym: " + LoadingState.points1;
		score1 = "Punkty uzyskane w poziomie drugim: " + LoadingState.points2;
		score2 = "Punkty uzyskane w poziomie trzecim: " + LoadingState.points3;
		LoadingState.totalPoints = LoadingState.points1+LoadingState.points2+LoadingState.points3;
		totalScore = "RAZEM: "+LoadingState.totalPoints;
		LoadingState.scores.draw(gc.getWidth()/2-LoadingState.scores.getWidth()/2, LoadingState.scores.getHeight());
		LoadingState.greenboard.draw(gc.getWidth()/2-LoadingState.greenboard.getWidth()/2, LoadingState.greenboard.getHeight()/3);
		g.setColor(Color.white);
		LoadingState.lastScoreUniFont.drawString(gc.getWidth()/2-LoadingState.lastScoreUniFont.getWidth(score)/2, gc.getHeight()/2-3*LoadingState.lastScoreUniFont.getHeight(score), score);
		LoadingState.lastScoreUniFont.drawString(gc.getWidth()/2-LoadingState.lastScoreUniFont.getWidth(score1)/2, gc.getHeight()/2-LoadingState.lastScoreUniFont.getHeight(score1), score1);
		LoadingState.lastScoreUniFont.drawString(gc.getWidth()/2-LoadingState.lastScoreUniFont.getWidth(score2)/2, gc.getHeight()/2+1*LoadingState.lastScoreUniFont.getHeight(score2), score2);
		LoadingState.lastScoreUniFont.drawString(gc.getWidth()/2-LoadingState.lastScoreUniFont.getWidth(totalScore)/2, gc.getHeight()/2+3.5f*LoadingState.lastScoreUniFont.getHeight(totalScore), totalScore);
		LoadingState.uniFont.drawString(gc.getWidth()/2-LoadingState.uniFont.getWidth(scoreText)/2, gc.getHeight()/1.1f+LoadingState.uniFont.getHeight(scoreText), scoreText);
		
	}
	
	/** Przypisanie numeru identyfikacyjnego klasie ScoreState */
	@Override
	public int getID() {
		return 3;
	}
}