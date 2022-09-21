package HomeWork.JavaEE1.task1;

import java.util.ArrayList;

public class MCD {

    private static ArrayList<MCDonalds> zakaz = new ArrayList<>();
    private static Long id = 1L;



    public static void addMCDonalds(MCDonalds mac){
        mac.setId(id);
        zakaz.add(mac);
        id++;
    }
    public static ArrayList<MCDonalds> getZakaz(){
        return zakaz;
    }
}
