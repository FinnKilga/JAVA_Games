/*

ball zurücksetzen nach punkt
ball kann prallt von oben|unten ab

paddle durch 15 teilen, pro teil 24°

punkte
*/

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
    private Ball ball;
    private Paddle paddle1;
    private Paddle paddle2;

    @Override
    public void init(GameContainer gameContainer) throws SlickException
    {
        this.actors = new ArrayList<>();
        this.paddle1 = new Paddle(Paddle.Player.player_1);
        this.actors.add(this.paddle1);
        this.paddle2 = new Paddle(Paddle.Player.player_2);
        this.actors.add(this.paddle2);
        this.ball = new Ball(this.paddle1,this.paddle2);
        this.actors.add(this.ball);
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
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException
    {
        for (Actor actor:this.actors)
        {
            actor.render(graphics);
        }
        String s1 = Integer.toString(this.paddle1.getPoints());
        String s2 = Integer.toString(this.paddle2.getPoints());
        graphics.drawString(s1,200,500);
        graphics.drawString(s2,600,500);
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
