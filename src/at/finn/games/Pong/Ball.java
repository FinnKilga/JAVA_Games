package at.finn.games.Pong;

import at.finn.games.Actor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Ball implements Actor {

    private float x,y;
    public enum Direction{left,right}
    private Direction direction;
    private float speed = 3f;

    public Ball()
    {
        this.x = 400;
        this.y = 300;
        this.direction = Direction.right;
    }


    @Override
    public void render(Graphics graphics)
    {
        graphics.fillOval(this.x,this.y,30,30);
    }

    @Override
    public void update(GameContainer gameContainer, int delta)
    {
        if (Direction.left == this.direction)
        {
            this.x -= (float) delta / this.speed;
        }
        else if (Direction.right == this.direction)
        {
            this.x += (float) delta / this.speed;
        }
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
