package at.tobinio;

import at.tobinio.ray.rayCaster.RayCaster;
import at.tobinio.ray.rayCatcher.RayCatcherLine;
import at.tobinio.util.Vec2;

/**
 * Created: ${DATE}
 *
 * @author Tobias Frischmann
 */

public class Main {
    public static void main(String[] args) {

        RayCaster rayCaster = new RayCaster();

        rayCaster.addRayCaster(new RayCatcherLine(new Vec2(2, 1), new Vec2(1, 2)));
        rayCaster.addRayCaster(new RayCatcherLine(new Vec2(3, 2), new Vec2(3, 5)));

        System.out.println(rayCaster.cast(new Vec2(5, 5), new Vec2(-1, -1)));
    }
}