package samolot;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
/** 
 * Klasa glowna, ktora pobiera parametry okienka gry
 * @author Kamila Wasilewska
 */
public class Main {

	/**
	 * Glowna klasa gry
	 * @param args lista argumentow
	 */
	public static void main(String[] args) {
		try {
			AppGameContainer app = new AppGameContainer(new Game("Zgadnij i Leæ"));
			app.setAlwaysRender(true);
			app.setTargetFrameRate(LoadingState.FPS);
			app.setVSync(true);
			app.setShowFPS(false);
			app.setDisplayMode(LoadingState.gameWidth, LoadingState.gameHeight, true);
			app.setIcon("images/icon.png");
			app.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
