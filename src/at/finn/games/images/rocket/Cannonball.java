package at.finn.games.images.rocket;

import at.finn.games.Actor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class Cannonball implements Actor {
    float x,y;
    float speed = 3;

    public Cannonball(float x, float y)
    {
        this.x = x + 69;
        this.y = y;
    }

    @Override
    public void render(Graphics graphics)
    {
        graphics.fillOval(this.x,this.y,10,10);
    }

    @Override
    public void update(GameContainer gameContainer, int delta)
    {
            this.y -= (float)delta/this.speed;
    }
}
