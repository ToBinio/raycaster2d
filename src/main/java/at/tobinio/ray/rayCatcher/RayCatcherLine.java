package at.tobinio.ray.rayCatcher;

import at.tobinio.util.Vec2;

/**
 * Created: 13.09.2022
 *
 * @author Tobias Frischmann
 */

public class RayCatcherLine extends RayCatcherObj {

    public RayCatcherLine(Vec2 pointA, Vec2 pointB) {
        Vec2 dir = pointB.copy().sub(pointA);

        rayCatcher.add(new RayCatcher(pointA, dir));
    }

    public RayCatcherLine(Vec2 location, Vec2 direction, float length) {
        rayCatcher.add(new RayCatcher(location, direction.mul(length)));
    }

    @Override
    public String toString() {
        return rayCatcher + "";
    }
}
