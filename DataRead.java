import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class DataRead {
    public static void main(String[] args)   {
        String data = ("/Users/yashtripathi/Documents/OneDrive/yash docs/Work/Collage/Semister 5/Java Lab/LAB_10/data.csv");
        try{
        List<regionalStats> df= readCsvStats(data);
        
        staticMethods Solutions = new staticMethods();

        //     Iterator i = df.iterator();

        //     while(i.hasNext())
        //     {
        //         System.out.println(((regionalStats)i.next()));
        //     }

        // Solutions.Q1(df);

        // Solutions.Q2(df);

        // Solutions.Q3(df);

        // Solutions.Q4(df);


        System.out.println("Saving the ARRAY of custom objects using seriisation reading it again to solve question ");

        serelise.save(df);

        List<regionalStats>obj = deSerelise.read();

        Solutions.Q4(obj);
        
        }
        catch(IOException e)
        {
            System.out.println(e+"1");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }

    static List<regionalStats> readCsvStats(String name) throws FileNotFoundException {
        List<regionalStats> dfList = new ArrayList<>();

        try {
            File data = new File(name);
            Scanner df = new Scanner(data);
            
            String line = df.nextLine();
            line = df.nextLine();
            while (line != null) {
                String[] attributes = line.split(",");
                regionalStats record = createRecord(attributes);
                dfList.add(record);
                line = df.nextLine();
            }
            df.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return dfList;
    }

    static regionalStats createRecord(String[] metadata)

    {
        int period = Integer.parseInt(metadata[0]);
        Boolean birth;
        if(new String(metadata[1]).equals(new String("Births")) ) { birth =  true;}
        else{birth = false;}
        String region = metadata[2];
        int count = Integer.parseInt(metadata[3]);

        return new regionalStats(period, birth, region, count);
    }

}
