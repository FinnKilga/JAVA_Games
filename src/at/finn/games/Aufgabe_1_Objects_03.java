package at.finn.games;

import org.newdawn.slick.*;

public class Aufgabe_1_Objects_03 extends BasicGame
{
    private float xSquare;
    private float ySquare;
    private float xOval;
    private float yOval;
    private float xCircle;
    private float yCircle;
    private boolean xOvalEnd;
    private boolean yCircleEnd;
    private int squareDirection;


    public Aufgabe_1_Objects_03(String title)
    {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException
    {
        this.yCircleEnd = false;
        this.xOvalEnd = false;
        this.xSquare = 150;
        this.ySquare = 150;
        this.squareDirection = 0;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException
    {
        float speed = (float)delta/5;
        if (!this.xOvalEnd)
        {
            this.xOval += speed;
            if (this.xOval >= 750)
            {
                this.xOvalEnd = true;
            }
        }
        else
        {
            this.xOval -= speed;
            if (this.xOval <= 0)
            {
                this.xOvalEnd = false;
            }
        }

        if (!this.yCircleEnd)
        {
            this.yCircle += speed;
            if (this.yCircle >= 550)
            {
                this.yCircleEnd = true;
            }
        }
        else
        {
            this.yCircle -= speed;
            if (this.yCircle <= 0)
            {
                this.yCircleEnd = false;
            }
        }

        if(this.squareDirection == 0)
        {
            this.xSquare += speed;
            if(this.xSquare >= 650)
            {
                this.squareDirection = 1;
            }
        }else if (this.squareDirection == 1)
        {
            this.ySquare += speed;
            if(this.ySquare >= 450)
            {
                this.squareDirection = 2;
            }
        } else if (this.squareDirection == 2)
        {
            this.xSquare -= speed;
            if(this.xSquare <= 150)
            {
                this.squareDirection = 3;
            }
        }else if (this.squareDirection == 3)
        {
            this.ySquare -= speed;
            if(this.ySquare <= 150)
            {
                this.squareDirection = 0;
            }
        }

    }

        @Override
        public void render(GameContainer gameContainer, Graphics graphics) throws SlickException
    {
        graphics.drawOval(this.xOval,this.yOval,50,20);
        graphics.drawRect(this.xSquare,this.ySquare,50,50);
        graphics.drawOval(this.xCircle,this.yCircle,50,50);
    }
    public static void main(String[] argv)
    {
        try {
            AppGameContainer container = new AppGameContainer(new Aufgabe_1_Objects_03("03"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
