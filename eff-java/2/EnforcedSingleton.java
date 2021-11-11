import java.util.*;

public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {
        return;
    }

    public void leaveTheBuilding() {
        return;
    }
}

// Singleton with static factory
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() {}
    public static Elvis getInstance() { return INSTANCE; }
    public static void leaveTheBuilding() {
        return;
    }

    // readResolve method to preserve singleton property
    private Object readResolve() {
        // return the one true elvis and let the garbage collector
        // take care of the impersonator.
        return INSTANCE;
    }
}

public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding() {}
}
