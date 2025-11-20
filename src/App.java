import java.math.BigDecimal;

import org.lessons.java.Headset;
import org.lessons.java.Smartphone;
import org.lessons.java.Television;

public class App {
    public static void main(String[] args) throws Exception {
        // television test
        Television bpCons = new Television(320402, "bp", "cons", BigDecimal.valueOf(159.99), 0.25f, 110, 70, 15, true);

        System.out.println(bpCons.toString());

        System.out.println(bpCons.getSerialCode());
        System.out.println(bpCons.getName());
        System.out.println(bpCons.getPrice());
        System.out.println(bpCons.getIsSmart());

        // smartphone test
        Smartphone iphone15 = new Smartphone(1412442, "iphone 15", "Apple", BigDecimal.valueOf(1099.99), 0.25f, 1241143, 512);

        System.out.println(iphone15.getSerialCode());
        System.out.println(iphone15.getName());
        System.out.println(iphone15.getPrice());
        System.out.println(iphone15.getMemory());

        // headset test
        Headset bortUltra = new Headset(1489372, "bort Ultra", "Rons", BigDecimal.valueOf(74.99), 0.25f, "black", false);

        System.out.println(bortUltra.getSerialCode());
        System.out.println(bortUltra.getName());
        System.out.println(bortUltra.getPrice());
        System.out.println(bortUltra.getColor());
    }
}
