package at.finn.games;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AlphaMapTest;

public class rectangles extends BasicGame
{
    private float x;
    private boolean xEnd;
    private float y;
    private boolean yEnd;
    public rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException //da kommt er am anfang einmal rein (vorarbeiten hier leitsten)
    {
        this.x = 100;
        this.y = 100;
        this.xEnd = false;
        this.yEnd = false;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException //wird ständig aufgerufen
    {
        float speed = (float)delta/5;
        if (this.xEnd == false)
        {
            this.x += speed;
            if (this.x >= 670)
            {
                this.xEnd = true;
            }
        }
        else
        {
            this.x -= speed;
            if (this.x <= 0)
            {
                this.xEnd = false;
            }
        }
        if (this.yEnd == false)
        {
            this.y += speed;
            if (this.y >= 520)
            {
                this.yEnd = true;
            }
        }
        else
        {
            this.y -= speed;
            if (this.y <= 0)
            {
                this.yEnd = false;
            }
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException //grafiken hier rein
    {
        graphics.drawOval(this.x,this.y,130,80);
        graphics.drawString("DVD",this.x + 50,this.y + 33);
    }
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new rectangles("rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
