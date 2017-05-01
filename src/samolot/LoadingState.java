package samolot;

import java.awt.Font;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.geom.Ellipse;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
/**
 * Klasa przechowujaca i ladujaca wiekszosc poczatkowych zasobow gry.
 * Pozwala ona na zapis parametrow do pliku. Typowe parametry to zasoby graficzne oraz zapis stanu gry.
 * @author Kamila Wasilewska
 */
public class LoadingState extends BasicGameState {
	/** Obraz tla */
	protected static Image background;
	/** Obraz logo gry */
	protected static Image logo;
	/** Obraz kolorowego logo gry */
	protected static Image logocol;
	/** Obraz samolotu */
	protected static Image plane;
	/** Obraz chmurki z pytaniem */
	protected static Image cloud;
	/** Obraz tla, na ktorym wyswietlany jest napis menu */
	protected static Image menu;
	/** Obraz tla, na ktorym wyswietlany jest czas, punkty i poziom */
	protected static Image label;
	/** Obraz wyswietlajacy sie w momencie zakonczenia gry */
	protected static Image gameover;
	/** Obraz wyœwietlajacy sie w momencie wlaczenia pomocy */
	protected static Image help;
	/** Obraz ukazujacy zasady gry */
	protected static Image help2;
	/** Obraz ukazujacy menu gry */
	protected static Image options;
	/** Obraz ukazujacy menu gry z uwzglednieniem moziwosci wznawiania gry */
	protected static Image options2;
	/** Obraz wyswietlajacy sie w momencie wlaczenia wynikow */
	protected static Image scores;
	/** Obraz tablicy szkolnej wyswietlajacy sie w momencie wlaczenia wynikow */
	protected static Image greenboard;
	/** Czcionka podstawowa */
	protected static Font font;
	/** Czcionka dla wynikow */
	protected static Font lastScoreFont;
	/** Czcionka bitmapowa, ktora moze wyswietlac znaki unicode */
	protected static UnicodeFont uniFont;
	/** Czcionka bitmapowa, ktora moze wyswietlac znaki unicode, uzyta w celu */
	protected static UnicodeFont lastScoreUniFont;
	/** Data i czas zapisu danych */
	protected static Date date;
	/** Format zapisu daty i czasu */
	protected static SimpleDateFormat format;
	/** Muzyka tla*/
	private Music music;
	/** Lista elips sluzaca do detekcji kolizji z samolotem */
	protected static ArrayList<Ellipse> clouds;
	/** Elipsa sluzaca do detekcji kolizji z chmurkami */
	protected static Ellipse planeEllipse;
	/** Generator liczb pseudolosowych */
	protected static Random random;
	/** Zmienna sluzaca do okreslenia czestotliwosci pojawiania sie chmur */
	protected static int timePassed = 0;
	/** Okreslenie czasu trwania poziomu */
	protected static int levelTime = 60000;
	/** Okreslenie poczatkowego polozenia samolotu oraz tla */
	protected static int xPlane, yPlane, xBackground, yBackground, xBackground2;
	/** Suma zdobytych punktow */
	protected static int totalPoints = 0;
	/** Liczba punktow uzyskana w pierwszym poziomie */
	protected static int points1 = 0;
	/** Liczba punktow uzyskana w drugim poziomie */
	protected static int points2 = 0;
	/** Liczba punktow uzyskana w trzecim poziomie */
	protected static int points3 = 0;
	/** Zmienna przechowujaca wynik z generatora liczb pseudolosowych */
	protected static int draw;
	/** Zmienna przechowujaca czas uruchomienia programu */
	protected static long startGameTime = System.currentTimeMillis();
	/** Zmienna przechowujaca calkowity czas gry */
	protected static long totalTime = 0;
	/** Zmienna przechowuj¹ca czas rozpoczecia dmuchania */
	protected static long startBlowTime = 0;
	/** Zmienna przechowuj¹ca ca³kowity czas dmuchania */
	protected static long totalBlowingTime = 0; 
	/** Tekst mówi¹cy o mo¿liwoœci przejscia na kolejny poziom */
	protected static String scoreText;
	/** Tekst mowiacy o zakonczeniu gry i mozliwosci powrotu do menu */
	protected static String gameOverText;
	/** Teskt mowiacy o zakonczeniu gry spowodowanym niewystarczajaca iloscia punktow */
	protected static String gameOverText1;
	/** Teskt mowiacy o zakonczeniu gry spowodowanym niewystarczajaca iloscia punktow */
	protected static String gameOverText2;
	/** Tekst bedacy nazwa uzytkownika */
	protected static String username;
	/** Plik, w ktorym przechowywane sa wyniki gry */
	protected static PrintWriter scoreTXT;
	/** Szerokosc pola graficznego gry */
	protected static int gameWidth = 1280;
	/** Wysokosc pola graficznego gry */
	protected static int gameHeight = 1024;
	/** Ilosc klatek na sekunde */
	protected static int FPS = 59;
	
	public LoadingState() {
		super();
	}

	/** Metoda ladowania zasobow gry */
	@SuppressWarnings("unchecked")
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		music = new Music("sounds/music.ogg");
		music.loop();
		background = new Image("images/background.jpg");
		logo = new Image("images/logo.png");
		logocol = new Image("images/logocol.png");
		plane = new Image("images/plane.png");
		cloud = new Image("images/cloud.png");
		menu = new Image("images/menu.png");
		label = new Image("images/label.png");
		gameover = new Image("images/gameover.png");
		help = new Image("images/help.png");
		help2 = new Image("images/help2.png");
		options = new Image("images/options.png");
		options2 = new Image("images/options2.png");
		scores = new Image("images/scores.png");
		greenboard = new Image("images/greenboard.png");
		font = new Font("Arial Black", Font.PLAIN, 28);
		lastScoreFont = new Font("Segoe Print", Font.BOLD, 40);
		uniFont = new UnicodeFont((font), 28, false, false);
		uniFont.addAsciiGlyphs();
		uniFont.addGlyphs(0x000, 0x017F);
		uniFont.getEffects().add(new ColorEffect());
		uniFont.loadGlyphs();
		lastScoreUniFont = new UnicodeFont((lastScoreFont), 40, false, false);
		lastScoreUniFont.addAsciiGlyphs();
		lastScoreUniFont.addGlyphs(0x000, 0x017F);
		lastScoreUniFont.getEffects().add(new ColorEffect());
		lastScoreUniFont.loadGlyphs();
		planeEllipse = new Ellipse(0, 0, plane.getWidth()/2, plane.getHeight()/2);
		clouds = new ArrayList<Ellipse>();
		random = new Random();
		xPlane = 10;
		yPlane = 10;
		xBackground = 0;
		yBackground = 0;
		xBackground2 = 0;
		scoreText = "Naciœnij ENTER, aby przejœæ do kolejnego poziomu";
		gameOverText = "Naciœnij ENTER, aby powróciæ do MENU g³ównego i spróbuj ponownie";
		gameOverText1 = "Niestety, nie uda³o siê Tobie uzyskaæ wymaganej liczby punktów ";
		gameOverText2 = "do przejœcia na kolejny poziom";
		format = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss");
		try {
			scoreTXT = new PrintWriter(new FileWriter("files/scores.txt", true));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** Aktualizowanie logiki gry */
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int t) throws SlickException {
		
	}
	
	/** Renderowanie ekranu gry */
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
	
	}
	
	/** Przypisanie numeru identyfikacyjnego klasie LoadingState */
	@Override
	public int getID() {
		return 9;
	}
}