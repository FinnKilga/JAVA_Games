package at.finn.games;
import at.finn.objects.*;
import org.newdawn.slick.*;

public class Aufgabe_04 extends BasicGame
{
    public Aufgabe_04(String title)
    {
        super(title);
    }

    Rectangle rectangle;
    Rectangle rectangle2;

    @Override
    public void init(GameContainer gameContainer) throws SlickException
    {
        this.rectangle = new Rectangle(50,50,20);
        this.rectangle2 = new Rectangle(100,100,5);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException
    {
        this.rectangle.update(delta);
        this.rectangle2.update(delta);
    }

        @Override
        public void render(GameContainer gameContainer, Graphics graphics) throws SlickException
    {
        this.rectangle.render(graphics);
        this.rectangle2.render(graphics);
    }
    public static void main(String[] argv)
    {
        try {
            AppGameContainer container = new AppGameContainer(new Aufgabe_04("games"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
