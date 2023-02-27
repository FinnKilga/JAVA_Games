package at.finn.games.Pong;

import at.finn.games.Actor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class Paddle implements Actor {

    private float x,y,speed;
    public enum Player{player_1,player_2}
    private Player player;

    public Paddle(Player player)
    {
        this.player = player;
        if (Player.player_1==this.player)
        {
            this.x = 30;
        }
        else
        {
            this.x = 750;
        }
        this.speed = 5;
        this.y = 200;
    }

    @Override
    public void render(Graphics graphics)
    {
        graphics.fillRect(this.x,this.y,20,150);
    }

    @Override
    public void update(GameContainer gameContainer, int delta)
    {
        if (this.player == Player.player_1)
        {
            if (gameContainer.getInput().isKeyDown(Input.KEY_S))
            {
                if(700-250 >= this.y)
                {
                    this.y += delta/this.speed;
                }
            } else if (gameContainer.getInput().isKeyDown(Input.KEY_W))
            {
                if (0 <= this.y)
                {
                    this.y -= delta/this.speed;
                }
            }
        } else if (this.player == Player.player_2)
        {
            if (gameContainer.getInput().isKeyDown(Input.KEY_DOWN))
            {
                if(700-250 >= this.y)
                {
                    this.y += delta/this.speed;
                }
            } else if (gameContainer.getInput().isKeyDown(Input.KEY_UP))
            {
                if (0 <= this.y)
                {
                    this.y -= delta/this.speed;
                }
            }
        }

    }
}
