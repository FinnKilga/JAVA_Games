package at.finn.games.figures.objects;

import at.finn.games.figures.Actor;
import org.newdawn.slick.Graphics;

public class Circle implements Actor
{
    private float x;
    private float y;
    private float speed;
    private float height = 20;
    private float width = 20;

    public Circle(float x, float y, float speed)
    {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void render(Graphics graphics)
    {

        graphics.drawOval(this.x,this.y,this.width,this.height);
    }
    public void update(int delta)
    {
        this.height += delta/this.speed/2;
        this.width += delta/this.speed/2;
        this.x -= (float)delta/this.speed;
        if (this.x < 0)
        {
            this.x = 780;
        }
    }
}
