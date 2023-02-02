package at.finn.games.figures.objects;

import at.finn.games.figures.Actor;
import org.newdawn.slick.Graphics;

public class Ellipse implements Actor {
    private float x,y;
    private float speed = 5;
    public Ellipse(float x, float y){
        this.y = y;
        this.x = x;
    }


    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y,50,15);
    }

    @Override
    public void update(int delta) {
        this.y += (float)delta/this.speed;
        if (this.y > 600-15)
        {
            this.y = 0;
        }
    }
}
