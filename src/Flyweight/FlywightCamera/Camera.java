package Flyweight.FlywightCamera;

public class Camera  {
    private int nrCamera;
    private String numeClient;

    public Camera(int nrCamera, String numeClient) {
        this.nrCamera = nrCamera;
        this.numeClient = numeClient;
    }

    public int getNrCamera() {
        return nrCamera;
    }

    public String getNumeClient() {
        return numeClient;
    }
}
