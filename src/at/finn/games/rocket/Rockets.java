package at.finn.games.rocket;

import at.finn.games.snowworld.Actor;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Rockets implements Actor {

    private Image rocketImage;

    public Rockets() throws SlickException {
        this.rocketImage = new Image("testdata/Rocket.jpg");
    }

    @Override
    public void render(Graphics graphics) {
        rocketImage.draw(100,100);
    }

    @Override
    public void update(int delta) {

    }
}
