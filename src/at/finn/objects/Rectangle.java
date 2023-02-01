package at.finn.objects;
import at.finn.games.Actor;
import org.newdawn.slick.*;
public class Rectangle implements Actor
{
    private float x;
    private float y;
    private float speed;
    public enum Direction{left,right}
    private Direction direction;

    public Rectangle(float x, float y, float speed, Direction direction)
    {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }

    public void render(Graphics graphics)
    {
        graphics.drawRect(this.x,this.y,20,20);
    }
    public void update(int delta)
    {
        if(this.direction == direction.left)
        {
            this.x -= (float)delta/this.speed;
            if (this.x < 0)
            {
                this.x = 780;
            }
        }
        else
        {
            this.x += (float)delta/this.speed;
            if (this.x > 780)
            {
                this.x = 0;
            }
        }

    }
}
