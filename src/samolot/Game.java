package samolot;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
/** 
 * Klasa, w ktorej inicjowane sa wszystkie stany gry
 * @author Kamila Wasilewska
 */
public class Game extends StateBasedGame {
		
	public Game(String title) {
		super(title);
	}

	/** Inicjowanie wszystkich stanow gry */
	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		this.addState(new LoginState());
		this.addState(new MenuState());
		this.addState(new PauseState());
		this.addState(new PauseState1());
		this.addState(new PauseState2());
		this.addState(new GameState());
		this.addState(new GameState1());
		this.addState(new GameState2());
		this.addState(new QuestionState());
		this.addState(new QuestionState1());
		this.addState(new QuestionState2());
		this.addState(new GameOverState());
		this.addState(new GameOverState1());
		this.addState(new GameOverState2());
		this.addState(new HelpState());
		this.addState(new ScoreState());
		this.addState(new ScoreState1());
		this.addState(new ScoreState2());
		this.addState(new ScoreState3());
		this.addState(new LoadingState());
	}
	
	

}
