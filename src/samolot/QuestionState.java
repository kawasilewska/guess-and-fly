package samolot;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
/** 
 * Klasa generujaca pytania w poziomie pierwszym
 * @author Kamila Wasilewska
 */
public class QuestionState extends BasicGameState {
	/** Obraz z pytaniem */
	private Image q1;
	/** Obraz z pytaniem */
	private Image q2;
	/** Obraz z pytaniem */
	private Image q3;
	/** Obraz z pytaniem */
	private Image q4;
	/** Obraz z pytaniem */
	private Image q5;
	/** Obraz z pytaniem */
	private Image q6;
	/** Obraz z pytaniem */
	private Image q7;
	/** Obraz z pytaniem */
	private Image q8;
	/** Obraz z pytaniem */
	private Image q9;
	/** Obraz z pytaniem */
	private Image q10;
	
	public QuestionState() {
		super();
	}
	
	/** Inicjowanie klasy QuestionState */
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		q1 = new Image("images/1.1.png");
		q2 = new Image("images/1.2.png");
		q3 = new Image("images/1.3.png");
		q4 = new Image("images/1.4.png");
		q5 = new Image("images/1.5.png");
		q6 = new Image("images/1.6.png");
		q7 = new Image("images/1.7.png");
		q8 = new Image("images/1.8.png");
		q9 = new Image("images/1.9.png");
		q10 = new Image("images/1.10.png");
	}

	/** Aktualizowanie logiki gry */
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int t) throws SlickException {
		LoadingState.levelTime -= t;		
		if (LoadingState.draw == 0) {
		if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q1.getWidth()/2)+550 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q1.getWidth()/2)+750
				&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q1.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q1.getHeight()/2)+300 
				&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			LoadingState.points1 += 1;
			sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
		} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q1.getWidth()/2)+350 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q1.getWidth()/2)+500
				&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q1.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q1.getHeight()/2)+300 
				&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
		} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q1.getWidth()/2)+100 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q1.getWidth()/2)+300
				&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q1.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q1.getHeight()/2)+300 
				&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
		}
		}
		
		if (LoadingState.draw == 1) {
			if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q2.getWidth()/2)+550 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q2.getWidth()/2)+750
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q2.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q2.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q2.getWidth()/2)+350 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q2.getWidth()/2)+500
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q2.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q2.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q2.getWidth()/2)+100 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q2.getWidth()/2)+300
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q2.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q2.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				LoadingState.points1 += 1;
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			}
			}
		
		if (LoadingState.draw == 2) {
			if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q3.getWidth()/2)+550 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q3.getWidth()/2)+750
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q3.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q3.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q3.getWidth()/2)+350 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q3.getWidth()/2)+500
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q3.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q3.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q3.getWidth()/2)+100 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q3.getWidth()/2)+300
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q3.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q3.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				LoadingState.points1 += 1;
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			}
			}
		
		if (LoadingState.draw == 3) {
			if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q4.getWidth()/2)+550 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q4.getWidth()/2)+750
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q4.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q4.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q4.getWidth()/2)+350 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q4.getWidth()/2)+500
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q4.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q4.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				LoadingState.points1 += 1;
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q4.getWidth()/2)+100 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q4.getWidth()/2)+300
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q4.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q4.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			}
			}
		
		if (LoadingState.draw == 4) {
			if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q5.getWidth()/2)+550 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q5.getWidth()/2)+750
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q5.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q5.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q5.getWidth()/2)+350 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q5.getWidth()/2)+500
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q5.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q5.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				LoadingState.points1 += 1;
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q5.getWidth()/2)+100 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q5.getWidth()/2)+300
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q5.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q5.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			}
			}
		
		if (LoadingState.draw == 5) {
			if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q6.getWidth()/2)+550 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q6.getWidth()/2)+750
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q6.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q6.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q6.getWidth()/2)+350 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q6.getWidth()/2)+500
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q6.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q6.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q6.getWidth()/2)+100 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q6.getWidth()/2)+300
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q6.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q6.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				LoadingState.points1 += 1;
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			}
			}
		
		if (LoadingState.draw == 6) {
			if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q7.getWidth()/2)+550 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q7.getWidth()/2)+750
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q7.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q7.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q7.getWidth()/2)+350 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q7.getWidth()/2)+500
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q7.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q7.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				LoadingState.points1 += 1;
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q7.getWidth()/2)+100 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q7.getWidth()/2)+300
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q7.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q7.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			}
			}
		
		if (LoadingState.draw == 7) {
			if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q8.getWidth()/2)+550 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q8.getWidth()/2)+750
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q8.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q8.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q8.getWidth()/2)+350 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q8.getWidth()/2)+500
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q8.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q8.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q8.getWidth()/2)+100 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q8.getWidth()/2)+300
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q8.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q8.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				LoadingState.points1 += 1;
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			}
			}
		
		if (LoadingState.draw == 8) {
			if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q9.getWidth()/2)+550 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q9.getWidth()/2)+750
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q9.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q9.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				LoadingState.points1 += 1;
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q9.getWidth()/2)+350 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q9.getWidth()/2)+500
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q9.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q9.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q9.getWidth()/2)+100 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q9.getWidth()/2)+300
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q9.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q9.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			}
			}
		
		if (LoadingState.draw == 9) {
			if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q10.getWidth()/2)+550 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q10.getWidth()/2)+750
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q10.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q10.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q10.getWidth()/2)+350 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q10.getWidth()/2)+500
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q10.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q10.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			} else if (gc.getInput().getMouseX() >= (gc.getWidth()/2-q10.getWidth()/2)+100 && gc.getInput().getMouseX() <= (gc.getWidth()/2-q10.getWidth()/2)+300
					&& gc.getInput().getMouseY() >= (gc.getHeight()/2-q10.getHeight()/2)+200 && gc.getInput().getMouseY() <= (gc.getHeight()/2-q10.getHeight()/2)+300 
					&& gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
				LoadingState.points1 += 1;
				sbg.enterState(10, new FadeOutTransition(), new FadeInTransition());
			}
			}
	}
	
	/** Renderowanie ekranu gry */
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		LoadingState.background.draw(0, 0, Color.gray);
		
		switch (LoadingState.draw) {
		case 0 : g.drawImage(q1, gc.getWidth()/2-q1.getWidth()/2, gc.getHeight()/2-q1.getHeight()/2); break;
		case 1 : g.drawImage(q2, gc.getWidth()/2-q2.getWidth()/2, gc.getHeight()/2-q2.getHeight()/2); break;
		case 2 : g.drawImage(q3, gc.getWidth()/2-q3.getWidth()/2, gc.getHeight()/2-q3.getHeight()/2); break;
		case 3 : g.drawImage(q4, gc.getWidth()/2-q4.getWidth()/2, gc.getHeight()/2-q4.getHeight()/2); break;
		case 4 : g.drawImage(q5, gc.getWidth()/2-q5.getWidth()/2, gc.getHeight()/2-q5.getHeight()/2); break;
		case 5 : g.drawImage(q6, gc.getWidth()/2-q6.getWidth()/2, gc.getHeight()/2-q6.getHeight()/2); break;
		case 6 : g.drawImage(q7, gc.getWidth()/2-q7.getWidth()/2, gc.getHeight()/2-q7.getHeight()/2); break;
		case 7 : g.drawImage(q8, gc.getWidth()/2-q8.getWidth()/2, gc.getHeight()/2-q8.getHeight()/2); break;
		case 8 : g.drawImage(q9, gc.getWidth()/2-q9.getWidth()/2, gc.getHeight()/2-q9.getHeight()/2); break;
		case 9 : g.drawImage(q10, gc.getWidth()/2-q10.getWidth()/2, gc.getHeight()/2-q10.getHeight()/2); break;
		}
	}

	/** Przypisanie numeru identyfikacyjnego klasie QuestionState */
	@Override
	public int getID() {
		return 20;
	}
}
