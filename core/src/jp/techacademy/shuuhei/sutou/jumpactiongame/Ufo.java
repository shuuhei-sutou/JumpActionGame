package jp.techacademy.shuuhei.sutou.jumpactiongame;

/**
 * Created by user on 2018/03/10.
 */
import com.badlogic.gdx.graphics.Texture;

public class Ufo extends GameObject{
    public static final float UFO_WIDTH = 2.0f;
    public static final float UFO_HEIGHT = 1.3f;

    public Ufo(Texture texture, int srcX, int srcY, int srcWidth, int srcHight){
        super(texture, srcX, srcY, srcWidth, srcHight);
        setSize(UFO_WIDTH, UFO_HEIGHT);
    }
}
