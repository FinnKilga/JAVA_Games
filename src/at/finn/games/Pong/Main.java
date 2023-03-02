/*
x und y vom Ball merken
wenn der Ball beim x vom brett ist, schauen ob er in der y range ist, wenn ja: zurück, wenn nein: punkt für gegner

zusatz: wenn ball im oberen drittel der range(brett) ist: !+|- die y koo vom paddle!
                                                               bisschen nach oben
                    mittleren drittel                         gerade zurück
                    unteren drittel                           bisschen nach unten
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
        this.ball = new Ball();
        this.actors.add(this.ball);
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException
    {
        for (Actor actor:this.actors)
        {
            actor.update(gameContainer,i);
        }
        if (this.ball.getDirection() == Ball.Direction.right)
        {
            if (this.ball.getX() > this.paddle2.getX() - this.ball.getSize() && this.ball.getX() < this.paddle2.getX() + 1)
            {
                if (this.ball.getY() < this.paddle2.getY() +150 && this.ball.getY() > this.paddle2.getY() - this.ball.getSize())
                {
                    this.ball.setDirection(Ball.Direction.left);
                    this.ball.setyPaddle(this.paddle2.getY());
                }
            }
        } else if (this.ball.getDirection() == Ball.Direction.left)
        {
            if (this.ball.getX() < this.paddle1.getX() + this.ball.getSize() - 5 && this.ball.getX() > this.paddle1.getX())
            {
                if (this.ball.getY() < this.paddle1.getY() +150 && this.ball.getY() > this.paddle1.getY() - this.ball.getSize())
                {
                    this.ball.setDirection(Ball.Direction.right);
                    this.ball.setyPaddle(this.paddle1.getY());
                }
            }
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
