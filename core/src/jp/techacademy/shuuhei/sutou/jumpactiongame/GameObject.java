package jp.techacademy.shuuhei.sutou.jumpactiongame;

/**
 * Created by user on 2018/03/10.
 */
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class GameObject extends Sprite{
    public final Vector2 velocity;

    public GameObject(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight){
        super(texture, srcX, srcY, srcWidth, srcHeight);

        velocity = new Vector2();
    }
}
