package at.finn.games.images.rocket;
import at.finn.games.Actor;
import org.newdawn.slick.*;
import java.util.ArrayList;
import java.util.List;


public class RocketMain extends BasicGame
{
    private Rocket rocket;
    private List<Actor> actors;
    public RocketMain(String title) throws SlickException {
        super(title);
    }
    @Override
    public void init(GameContainer gameContainer) throws SlickException
    {
        this.rocket = new Rocket();
        this.actors = new ArrayList<>();
        this.actors.add(this.rocket);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException
    {
        this.rocket.update(gameContainer, delta);
    }

        @Override
        public void render(GameContainer gameContainer, Graphics graphics) throws SlickException
    {
        this.rocket.render(graphics);
    }
    public static void main(String[] argv)
    {
        try {
            AppGameContainer container = new AppGameContainer(new RocketMain("games"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
