package sound;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;
import state.Options;

/**
 * Class managing the sound effect
 */
public class SoundEffect {

    private Sound click;
    private Sound levelUp;
    private Sound dagger;

    private SoundEffect() throws SlickException {
        click = new Sound("src/ressources/sound/click.wav");
        levelUp = new Sound("src/ressources/sound/levelUp.wav");
        dagger = new Sound("src/ressources/sound/dagger.wav");
    }

    /**
     * The SoundEffect instance
     */
    public static SoundEffect instance;

    static {
        try {
            instance = new SoundEffect();
        } catch (SlickException e) {
            System.out.println(e);
        }
    }

    /**
     * Play a click sound
     */
    public static void click() {
        instance.click.play(1, 0.4f * Options.getSoundLevel());
    }

    /**
     * Play a level up sound
     */
    public static void levelUp() {
        instance.levelUp.play(1, 0.6f * Options.getSoundLevel());
    }

    /**
     * Play a blow of dagger sound
     */
    public static void dagger() {
        instance.dagger.play(1, 0.8f * Options.getSoundLevel());
    }

}
