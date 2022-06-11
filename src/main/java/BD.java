import java.util.HashMap;
import java.util.Map;

public class BD {

    private static Map<Integer, Carga> cargas = new HashMap<>();

    public static Carga getCarga(Integer codigo) {
        return cargas.get(codigo);
    }

    public static void addCarga (Carga carga) {
        cargas.put(carga.getCodigo(), carga);
    }
}
