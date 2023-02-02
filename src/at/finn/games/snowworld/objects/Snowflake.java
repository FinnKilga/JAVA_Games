package at.finn.games.snowworld.objects;

import at.finn.games.snowworld.Actor;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class Snowflake implements Actor {
    public enum Size{big,small, medium}
    public Size size;
    private float x;
    private float y;
    private double speed;
    private Random random = new Random();

    public Snowflake(Size size) {
        this.size = size;
        randomPosition();
    }

    @Override
    public void render(Graphics graphics) {
        if (this.size == Size.big)
        {
            graphics.fillOval(this.x,this.y,10,10);
            this.speed = 8;
        } else if (this.size == Size.medium)
        {
            graphics.fillOval(this.x,this.y,7,7);
            this.speed = 12;
        }
        else
        {
            graphics.fillOval(this.x,this.y,4,4);
            this.speed = 15;
        }
    }

    @Override
    public void update(int delta) {
        this.y += (float)delta/this.speed;
        if (this.y > 650)
        {
            randomPosition();
        }

    }

    private void randomPosition()
    {
         this.x = this.random.nextInt(800);
         this.y = this.random.nextInt(600) - 620;
    }
}
