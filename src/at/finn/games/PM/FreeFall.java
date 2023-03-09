package at.finn.games.PM;

import at.finn.games.Main_Template;
import org.newdawn.slick.*;

public class FreeFall extends BasicGame
{

    public FreeFall(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    }

    public static void main(String[] argv)
    {
        try {
            AppGameContainer container = new AppGameContainer(new FreeFall("free fall"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
