package at.tobinio.ray.rayCatcher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created: 13.09.2022
 *
 * @author Tobias Frischmann
 */

public abstract class RayCatcherObj {

    protected final List<RayCatcher> rayCatcher;

    {
        rayCatcher = new ArrayList<>();
    }

    public List<RayCatcher> getRayCatcher() {
        return rayCatcher;
    }
}
