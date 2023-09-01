package ModelElements;

public class Scene {
    int id;
    PoligonalModel models;
    Flash flashes;
    Camera camera;


    public Scene(PoligonalModel models,Flash flashes,Camera camera) {
        this.models=models;
        this.flashes = flashes;
        this.camera=camera;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setId(int id) {
        this.id = id;
    }
}
