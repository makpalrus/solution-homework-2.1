package flyweight;
import java.util.HashMap;
import java.util.Map;

public class MarkerFactory {
    public static final Map<String, Marker> markers = new HashMap<>();

    public static Marker getMarker(String type) {
        if (!markers.containsKey(type)) {
            markers.put(type, new ConcreteMarker(type));
        }
        return markers.get(type);
    }

}