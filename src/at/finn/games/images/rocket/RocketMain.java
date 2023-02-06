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
        for (Actor actor:this.actors)
        {
            actor.update(gameContainer,delta);
        }

    }
    @Override
    public void keyPressed(int key, char c)
    {
        if (key == Input.KEY_SPACE)
        {
            Cannonball cb = new Cannonball(this.rocket.getX(),this.rocket.getY());
            this.actors.add(cb);
        }
    }

        @Override
        public void render(GameContainer gameContainer, Graphics graphics) throws SlickException
    {
        for (Actor actor:this.actors)
        {
            actor.render(graphics);
        }
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
