package edu.zhengrui;

public class Camera {
    private String name = "";//attention
    private Camera(){
    }

    private static Camera _instance;
    private static Object obj = new Object();
    public static Camera getInstance(){//attention
        if (_instance == null){
            synchronized (obj){
                if (_instance == null){
                    _instance = new Camera();
                }
            }
        }

        return _instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
