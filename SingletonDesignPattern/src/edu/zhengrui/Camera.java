package edu.zhengrui;

public class Camera {
    /** This is how your create singleton design pattern
     * 1. Create a class
     * 2. Default constructor as private
     * 3. Create private static instance of the class with called _instance
     * 4. Create a public function which will get you instance of the class in step 3
     * 5. Create a private static object which will be used in locking the instance
     * 6. In the function created in step 4 lock the creation of object
     * 7. Optionally do double locking for performance
     */
    private Camera(){}
    private static Camera _instance;
    private static Object obj = new Object();
    private String name = "";
    public static Camera getInstance(){
//        if (_instance == null) {
//            synchronized (obj){
//                if (_instance == null){
//                    _instance = new Camera();
//                }
//            }
//        }

        if (_instance == null){
            _instance = new Camera();
        }

        return _instance;
    }

    public void setCameraName(String name){
        this.name = name;
    }

    public String getCameraName(){
        return this.name;
    }

}
