package at.tobinio.ray.rayCaster;

import at.tobinio.ray.rayCatcher.RayCatcher;
import at.tobinio.ray.rayCatcher.RayCatcherObj;
import at.tobinio.util.Vec2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created: 13.09.2022
 *
 * @author Tobias Frischmann
 */

public class RayCaster {

    private final List<RayCatcherObj> rayCatcherObjs;

    public RayCaster() {
        rayCatcherObjs = new ArrayList<>();
    }

    public void addRayCaster(RayCatcherObj rayCatcherObj) {
        rayCatcherObjs.add(rayCatcherObj);
    }

    public RayCatcherObj cast(Vec2 startPos, Vec2 dir) {

        float nearestDistance = 0;
        RayCatcherObj nearestCatcherObj = null;

        for (RayCatcherObj rayCatcherObj : rayCatcherObjs) {
            for (RayCatcher rayCatcher : rayCatcherObj.getRayCatcher()) {

                float d = dir.x * rayCatcher.direction().y - dir.y * rayCatcher.direction().x;
                float u = ((rayCatcher.location().x - startPos.x) * dir.y - (rayCatcher.location().y - startPos.y) * dir.x) / d;
                float t = ((rayCatcher.location().x - startPos.x) * rayCatcher.direction().y - (rayCatcher.location().y - startPos.y) * rayCatcher.direction().x) / d;

                System.out.println("U : " + u);
                System.out.println("T : " + t);

                if (u < 0 || u > 1 || t < 0) continue;

                if (nearestCatcherObj == null || nearestDistance > t) {
                    nearestCatcherObj = rayCatcherObj;
                    nearestDistance = t;
                }
            }
        }

        return nearestCatcherObj;
    }
}
