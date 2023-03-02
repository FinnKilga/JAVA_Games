package at.finn.games.Pong;

import at.finn.games.Actor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Ball implements Actor {

    private float x,y;
    public enum Direction{left,right}
    private Direction direction;
    private float speed = 3f;
    private int size = 30;
    private double yPaddle;

    public Ball()
    {
        this.x = 400;
        this.y = 300;
        this.direction = Direction.right;
    }


    @Override
    public void render(Graphics graphics)
    {
        graphics.fillOval(this.x,this.y,this.size,this.size);
    }

    @Override
    public void update(GameContainer gameContainer, int delta)
    {
        if (this.yPaddle < 150/2)
        {
            this.y -= (float) delta / (this.yPaddle + this.speed);
        }
        if (Direction.left == this.direction)
        {
            this.x -= (float) delta / this.speed;

        }
        else if (Direction.right == this.direction)
        {
            this.x += (float) delta / this.speed;
            if (this.yPaddle > 150/2)
            {
                this.y += (float) delta / (this.yPaddle-150 + this.speed);
            }
        }
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public void setyPaddle(double yPaddle) {
        this.yPaddle = yPaddle;
    }
}
