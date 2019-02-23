package services.cacheservice;

import java.util.HashMap;
import java.util.Map;

public class CacheManager {

    private static Map<Object,Object> cachedObjectMap = new HashMap<>();

    public static void insertIntoCache(Cacheable object){
        cachedObjectMap.put(object.getIdentifier(), object);
    }

    public static Cacheable getObjectFromCache(Object identifier){

        Cacheable obj = (Cacheable) cachedObjectMap.get(identifier);
        if(obj == null)
            return null;

        return obj;
    }

    public static void emptyMap(){
        cachedObjectMap.clear();
    }
}
