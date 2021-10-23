import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class serelise {   
public static void save(List<regionalStats> obj) throws FileNotFoundException, IOException {
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("lab9.ser"));
    // regionalStats new1 = new regionalStats(2005, true, "Calcutta", 2314);
    out.writeObject(obj);
    String hitesh = "Main bhout bada chutiya hun";      
    out.writeObject(hitesh);
    out.close();

}

}
