package at.finn.games.images.rocket;

import at.finn.games.Actor;
import org.newdawn.slick.*;

public class Rocket implements Actor {

    private Image rocketImage;
    private float x,y;

    public Rocket() throws SlickException {
        this.rocketImage = new Image("testdata/rocket.png");
        this.x = 30;
        this.y = 30;
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
            this.y ++;
        } if (gameContainer.getInput().isKeyDown(Input.KEY_W))
        {
            this.y --;
        } if (gameContainer.getInput().isKeyDown(Input.KEY_A))
        {
            this.x --;
        } if (gameContainer.getInput().isKeyDown(Input.KEY_D))
        {
            this.x ++;
        }

    }
}
