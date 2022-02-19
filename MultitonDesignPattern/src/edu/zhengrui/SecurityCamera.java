package edu.zhengrui;

import java.util.HashMap;

/**
 * 1. Create a class
 * 2. Create a private static HashMap for the class with id, Class
 * 3. Create static private object for locking
 * 4. Create a public method which will return the Class instance for particular id
 * 5. if the id is not initialized, double lock and create a new instance and add it in the HashMap
 * 6. if the id exists return the value from map
 */
public class SecurityCamera {
    private static HashMap<Integer, SecurityCamera> cameras = new HashMap<>();
    private SecurityCamera(){}
    private static Object obj = new Object();

    public static SecurityCamera getCamera(int id){
        if (! cameras.containsKey(id)){
            synchronized (obj){
                if (!cameras.containsKey(id)){
                    cameras.put(id, new SecurityCamera());
                }
            }
        }
        return cameras.get(id);
    }
}
