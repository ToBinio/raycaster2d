package at.tobinio.ray;

import at.tobinio.ray.rayCatcher.RayCatcher;
import at.tobinio.ray.rayCatcher.RayCatcherObj;

/**
 * Created: 13.09.2022
 *
 * @author Tobias Frischmann
 */

public record RayCast(float distance, RayCatcherObj rayCatcherObj, RayCatcher rayCatcher) {
}
