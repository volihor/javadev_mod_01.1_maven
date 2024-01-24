package myname;

import com.google.gson.GsonBuilder;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Create Maven FatJar
 * with name myname.jar
 */
public class MyName
{
    public static void main( String[] args )
    {
        MyName myName = new MyName();

        // first way of creating json from object
        UserMaven userObj = myName.createUserObj("Igor", "Voloshyn");
        String jsonString1 = myName.createJsonString(userObj);
        System.out.println(jsonString1);

        // second way of creating json from LinkedHashMap()
        Map mapName = myName.createMapName("Igor", "Voloshyn");
        String jsonString2 = myName.createJsonString(mapName);
    }

    UserMaven createUserObj(String name, String lastName){
        return  (new UserMaven(name, lastName));
    }

    Map<String, String> createMapName(String name, String lastName){
        Map <String, String> mapList = new LinkedHashMap();
        mapList.put("name", name);
        mapList.put("lastName", lastName);
        return mapList;
    }

    String createJsonString(Object object){
        return new GsonBuilder().setPrettyPrinting().create().toJson(object);
    }
}
