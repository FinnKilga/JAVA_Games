package at.finn.games.snowworld;

import at.finn.games.snowworld.*;
import at.finn.games.snowworld.objects.Snowflake;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class Snowworld extends BasicGame {
    public Snowworld(String title) {
        super(title);
    }
    private List<Actor> snowflakes;

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.snowflakes = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            this.snowflakes.add(new Snowflake(Snowflake.Size.big));
            this.snowflakes.add(new Snowflake(Snowflake.Size.medium));
            this.snowflakes.add(new Snowflake(Snowflake.Size.small));
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor snowflake:this.snowflakes)
        {
            snowflake.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor snowflake:this.snowflakes) {
            snowflake.render(graphics);
        }
    }
    public static void main(String[] argv)
    {
        try {
            AppGameContainer container = new AppGameContainer(new Snowworld("Snowworld"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
