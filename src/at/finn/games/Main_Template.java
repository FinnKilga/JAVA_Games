package at.finn.games;
import org.newdawn.slick.*;


public class Main_Template extends BasicGame
{
    public Main_Template(String title)
    {
        super(title);
    }
    @Override
    public void init(GameContainer gameContainer) throws SlickException
    {

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException
    {

    }

        @Override
        public void render(GameContainer gameContainer, Graphics graphics) throws SlickException
    {

    }

    @Override
    public void keyPressed(int key, char c)
    {

    }

    public static void main(String[] argv)
    {
        try {
            AppGameContainer container = new AppGameContainer(new Main_Template("games"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
