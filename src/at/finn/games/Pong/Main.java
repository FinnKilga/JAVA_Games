package at.finn.games.Pong;

import at.finn.games.Actor;
import at.finn.games.Main_Template;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class Main extends BasicGame {
    public Main(String title) {
        super(title);
    }

    private List<Actor> actors;

    @Override
    public void init(GameContainer gameContainer) throws SlickException
    {
        this.actors = new ArrayList<>();
        Paddle paddle = new Paddle(Paddle.Player.player_1);
        this.actors.add(paddle);
        Paddle paddle1 = new Paddle(Paddle.Player.player_2);
        this.actors.add(paddle1);
        Ball ball = new Ball();
        this.actors.add(ball);
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException
    {
        for (Actor actor:this.actors)
        {
            actor.update(gameContainer,i);
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
            AppGameContainer container = new AppGameContainer(new Main("Pong"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
