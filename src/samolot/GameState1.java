package samolot;

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
 * Klasa generujaca podstawowe elementy gry dla poziomu drugiego 
 * @author Kamila Wasilewska
 */
public class GameState1 extends BasicGameState {
	/** Zmienna okreslajaca poziom gry */
	private int level;
	
	public GameState1() {
		super();
	}
	
	/** Inicjowanie klasy GameState1 wraz z ustawieniem poziomu drugiego */
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		level = 2;
	}

	/** Aktualizowanie logiki gry: generowanie poruszajacego sie tla, samolotu, chmurek oraz zliczanie czasu dmuchania */
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int t) throws SlickException {
		LoadingState.levelTime -= t;
		LoadingState.timePassed += t;
		if (LoadingState.timePassed > 6000 + LoadingState.random.nextInt(3000)) {
			LoadingState.timePassed = 0;
			LoadingState.clouds.add(new Ellipse(gc.getWidth()+LoadingState.cloud.getWidth()/2, LoadingState.cloud.getHeight()/2+LoadingState.random.nextInt((gc.getHeight()/4)*3),
					LoadingState.cloud.getWidth()/4, LoadingState.cloud.getHeight()/5));
		}
		
		for (Ellipse e : LoadingState.clouds) {
			e.setCenterX(e.getCenterX()-(t/4));
		}
		
		for (int i = LoadingState.clouds.size()-1; i >= 0; i--) {
			Ellipse e = LoadingState.clouds.get(i);
			if (e.getCenterX() < -LoadingState.cloud.getWidth()/2) {
				LoadingState.clouds.remove(i);
			} else if (e.intersects(LoadingState.planeEllipse)) {
				LoadingState.draw = LoadingState.random.nextInt(9);
				LoadingState.clouds.remove(i);
				sbg.enterState(21, new FadeOutTransition(), new FadeInTransition());
			}
		}
		
		LoadingState.planeEllipse.setCenterX(LoadingState.xPlane+LoadingState.plane.getWidth()/2-10);
		LoadingState.planeEllipse.setCenterY(LoadingState.yPlane+LoadingState.plane.getHeight()/2-10);
		
		if (gc.getInput().isKeyDown(Input.KEY_UP)) {
			LoadingState.totalBlowingTime += t;
			LoadingState.yPlane -= 12;
		}
		
		if(LoadingState.yPlane > gc.getHeight() || LoadingState.yPlane < -LoadingState.plane.getHeight()) {
			LoadingState.gameOverText1 = "Przekroczyłeś granice ekranu";
			LoadingState.gameOverText2 = "";
			sbg.enterState(51, new FadeOutTransition(), new FadeInTransition());
		}
		LoadingState.yPlane += 2;
		
		LoadingState.xBackground -= 1;
		LoadingState.xBackground2 -= 1;
		if (LoadingState.xBackground == -1) {
			LoadingState.xBackground = LoadingState.background.getWidth()-1;
		}
		if (LoadingState.xBackground2 == -LoadingState.background.getWidth()) {
			LoadingState.xBackground2 = 0;
		}
		
		if (gc.getInput().isKeyPressed(Input.KEY_ESCAPE)) {
			sbg.enterState(41, new FadeOutTransition(), new FadeInTransition());
		}
		
		if (LoadingState.levelTime <= 16) {
			if (LoadingState.points2 < 3) {
			sbg.enterState(51, new FadeOutTransition(), new FadeInTransition());
			} else {
				sbg.enterState(31, new FadeOutTransition(), new FadeInTransition());
			}
		}
	}
	
	/** Renderowanie ekranu gry */
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		LoadingState.background.draw(LoadingState.xBackground, LoadingState.yBackground);
		LoadingState.background.draw(LoadingState.xBackground2, LoadingState.yBackground);
		g.setColor(Color.transparent);
		g.fill(LoadingState.planeEllipse);
		LoadingState.plane.draw(LoadingState.xPlane, LoadingState.yPlane);
		for (Ellipse e : LoadingState.clouds) {
			g.fill(e);
			LoadingState.cloud.draw(e.getCenterX()-LoadingState.cloud.getWidth()/2, e.getCenterY()-LoadingState.cloud.getHeight()/2);
		}
		LoadingState.menu.draw(10, 924);
		g.setColor(Color.white);
		LoadingState.label.draw(610, 924);
		LoadingState.uniFont.drawString(635, 940, "CZAS: " + LoadingState.levelTime/1000 + " s");
		LoadingState.label.draw(830, 924);
		LoadingState.uniFont.drawString(855, 940, "PUNKTY: " + LoadingState.points2);
		LoadingState.label.draw(1050, 924);
		LoadingState.uniFont.drawString(1075, 940, "POZIOM: " + level);
	}

	/** Przypisanie numeru identyfikacyjnego klasie GameState1 */
	@Override
	public int getID() {
		return 11;
	}
	
}
