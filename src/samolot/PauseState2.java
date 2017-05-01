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
 * Klasa generujaca ekran pauzy dla poziomu trzeciego
 * @author Kamila Wasilewska
 */
public class PauseState2 extends BasicGameState {
	
	public PauseState2() {
		super();
	}

	/** Inicjowanie klasy PauseState2 */
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		
	}

	/** Aktualizowanie logiki gry */
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int t) throws SlickException {
		if(gc.getInput().getMouseX() >= (gc.getWidth()/2-LoadingState.options2.getWidth()/2)+50 && gc.getInput().getMouseX() <= (gc.getWidth()/2-LoadingState.options2.getWidth()/2)+750
				&& gc.getInput().getMouseY() >= (gc.getHeight()/4+LoadingState.options2.getHeight()/8)-125 && gc.getInput().getMouseY() <= (gc.getHeight()/4+LoadingState.options2.getHeight()/8)
				&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			sbg.enterState(12, new FadeOutTransition(), new FadeInTransition());
		} else if(gc.getInput().getMouseX() >= (gc.getWidth()/2-LoadingState.options2.getWidth()/2)+50 && gc.getInput().getMouseX() <= (gc.getWidth()/2-LoadingState.options2.getWidth()/2)+750
				&& gc.getInput().getMouseY() >= (gc.getHeight()/4+LoadingState.options2.getHeight()/8)+25 && gc.getInput().getMouseY() <= (gc.getHeight()/4+LoadingState.options2.getHeight()/8)+150
				&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			LoadingState.clouds = new ArrayList<Ellipse>();
			LoadingState.levelTime = 60000;
			LoadingState.totalPoints = 0;
			LoadingState.points1 = 0;
			LoadingState.points2 = 0;
			LoadingState.points3 = 0;
			LoadingState.timePassed = 0;
			LoadingState.yPlane = 10;
			LoadingState.xBackground = 0;
			LoadingState.xBackground2 = 0;
			LoadingState.gameOverText1 = "Niestety, nie uda³o siê Tobie uzyskaæ wymaganej liczby punktów ";
			LoadingState.gameOverText2 = "do przejœcia na kolejny poziom";
			sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
		} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-LoadingState.options2.getWidth()/2)+50 && gc.getInput().getMouseX() <= (gc.getWidth()/2-LoadingState.options2.getWidth()/2)+750
				&& gc.getInput().getMouseY() >= (gc.getHeight()/4+LoadingState.options2.getHeight()/8)+175 && gc.getInput().getMouseY() <= (gc.getHeight()/4+LoadingState.options2.getHeight()/8)+300
				&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			sbg.enterState(3, new FadeOutTransition(), new FadeInTransition());
		} else if(gc.getInput().getMouseX() >= (gc.getWidth()/2-LoadingState.options2.getWidth()/2)+50 && gc.getInput().getMouseX() <= (gc.getWidth()/2-LoadingState.options2.getWidth()/2)+750
				&& gc.getInput().getMouseY() >= (gc.getHeight()/4+LoadingState.options2.getHeight()/8)+ 350 && gc.getInput().getMouseY() <= (gc.getHeight()/4+LoadingState.options2.getHeight()/8)+475
				&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			sbg.enterState(2, new FadeOutTransition(), new FadeInTransition());
		} else if(gc.getInput().getMouseX() >= (gc.getWidth()/2-LoadingState.options2.getWidth()/2)+50 && gc.getInput().getMouseX() <= (gc.getWidth()/2-LoadingState.options2.getWidth()/2)+750
				&& gc.getInput().getMouseY() >= (gc.getHeight()/4+LoadingState.options2.getHeight()/8)+ 500 && gc.getInput().getMouseY() <= (gc.getHeight()/4+LoadingState.options2.getHeight()/8)+625
				&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			LoadingState.totalPoints = LoadingState.points1 + LoadingState.points2 + LoadingState.points3;
			LoadingState.scoreTXT.println("U¿ytkownik: " + LoadingState.username +"; "+ "Pierwszy poziom: "+ LoadingState.points1 +"; "+ "Drugi poziom: " + LoadingState.points2 +"; "+ "Trzeci poziom: " + LoadingState.points3
					+"; "+ "RAZEM: " + LoadingState.totalPoints +"; "+ "Czas gry: " + LoadingState.totalTime/1000 + " s.");
			LoadingState.scoreTXT.close();
			gc.exit();
		}
	}
	
	/** Renderowanie ekranu gry */
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		LoadingState.background.draw(0, 0, Color.gray);
		LoadingState.options2.draw(gc.getWidth()/2-LoadingState.options2.getWidth()/2, (gc.getHeight()/4+LoadingState.options2.getHeight()/8)-169);
	}

	/** Przypisanie numeru identyfikacyjnego klasie PauseState2 */
	@Override
	public int getID() {
		return 41;
	}
}
