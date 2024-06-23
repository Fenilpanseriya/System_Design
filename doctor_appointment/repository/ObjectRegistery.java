package repository;

import java.util.HashMap;
import java.util.Map;

public class ObjectRegistery {
    private static Map<String,Object>registery=new HashMap<>();

   public static Object get(String name){
    return registery.get(name);
   }
   public static void put(String name,Object o){
    registery.put(name,o);
   }
}
