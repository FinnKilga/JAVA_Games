package at.finn.games.Pong;

import at.finn.games.Actor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Ball implements Actor {

    private double x,y,speed,angle;
    private int size;
    public enum Direction{left,right}
    private Direction direction;
    private Paddle paddle1,paddle2;

    public Ball(Paddle paddle1,Paddle paddle2)
    {
        this.x = 400;
        this.y = 300;
        this.speed = 3;
        this.size = 30;
        this.paddle1 = paddle1;
        this.paddle2 = paddle2;
        this.direction = Direction.right;
        this.angle = 0;
    }


    @Override
    public void render(Graphics graphics)
    {
        graphics.fillOval((float)this.x,(float) this.y,this.size,this.size);
    }

    @Override
    public void update(GameContainer gameContainer, int delta)
    {
        if (this.y <= 0 && this.direction == Direction.right)
        {
            this.angle += 90;
            //y--
        } else if (this.y <= 0 && this.direction == Direction.left)
        {
            this.angle -= 90;
            //y--
        }
        if (this.y >= 600 && this.direction == Direction.right)
        {
            this.angle -= 90;
        } else if (this.y >= 600 && this.direction == Direction.left)
        {
            this.angle += 90;
        }
        //paddle left hit
        if (this.direction == Direction.left && this.x <= paddle1.getX())
        {
            if(this.paddle1.getY() < this.y && this.paddle1.getY() + this.paddle1.getSize() > this.y)
            {
                //calculate angle
                this.direction = Direction.right;
                //send ball back
            }
        }
        //paddle right hit

        //paddle missed ball
            //write points --> just call function for the winning paddle
    }





    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

}
