package at.finn.objects;

import at.finn.games.Actor;
import org.newdawn.slick.Graphics;

public class Circle implements Actor
{
    private float x;
    private float y;
    private float speed;

    public Circle(float x, float y, float speed)
    {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void render(Graphics graphics)
    {

        graphics.drawOval(this.x,this.y,20,20);
    }
    public void update(int delta)
    {
        this.x -= (float)delta/this.speed;
        if (this.x < 0)
        {
            this.x = 780;
        }
    }
}
