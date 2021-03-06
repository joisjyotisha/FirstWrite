package Shankari.core;
import java.awt.geom.IllegalPathStateException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Preliminary {
    public void checkDir() {
        File home = new File(Const.HOME_DIR);
        File ephe = new File(Const.EPHE_DIR);
        File geoname = new File(Const.GEONAMES);
       if(!home.exists())
           home.mkdir();
       else if(!ephe.exists())
           ephe.mkdirs();
       else if(!geoname.exists())
           writeDatabaseFile();


    }
    public void writeDatabaseFile(){
        try{
            Files.copy(Paths.get("E:\\Arun\\geonames1000.sql"),
                    Paths.get(Const.GEONAMES), StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e){
            System.out.println("Error in Writing Database File"+e.getStackTrace());
        }

    }
}
