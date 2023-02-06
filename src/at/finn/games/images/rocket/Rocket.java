package at.finn.games.images.rocket;

import at.finn.games.Actor;
import org.newdawn.slick.*;

public class Rocket implements Actor {

    private Image rocketImage;
    private float x,y,speed;

    public Rocket() throws SlickException {
        Image image = new Image("testdata/rocket.png");
        this.rocketImage = image.getScaledCopy(150,150);
        this.x = 30;
        this.y = 30;
        this.speed = 1.8f;
    }

    @Override
    public void render(Graphics graphics)
    {
        rocketImage.draw(this.x,this.y);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        if (gameContainer.getInput().isKeyDown(Input.KEY_S))
        {
            if (this.y < 600-150)
            {
                this.y += (float)delta/this.speed;
            }
        } if (gameContainer.getInput().isKeyDown(Input.KEY_W))
        {
            if (this.y > 0)
            {
                this.y -= (float)delta/this.speed;
            }
        } if (gameContainer.getInput().isKeyDown(Input.KEY_A))
        {
            if (this.x > -45)
            {
                this.x -= (float)delta/this.speed;
            }
        } if (gameContainer.getInput().isKeyDown(Input.KEY_D))
        {
            if (this.x < 705)
            {
                this.x += (float)delta/this.speed;
            }
        }


    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
