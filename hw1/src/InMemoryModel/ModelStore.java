package InMemoryModel;

import ModelElements.*;
import InMemoryModel.IModelChangedObserver;

public class ModelStore implements IModelChanger {
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private IModelChangedObserver changeObserver;

    public ModelStore(IModelChangedObserver changeObserver) {
        this.changeObserver = changeObserver;

        this.models = new PoligonalModel(new Poligone());
        this.flashes = new Flash();
        this.cameras = new Camera();

        this.scenes = new Scene(this.models, this.flashes, this.cameras);
    }

    public Scene getScene(int n) {
        return this.scenes;
    }

    @Override
    public void notifyChange(IModelChanger sender) {
    }
}
