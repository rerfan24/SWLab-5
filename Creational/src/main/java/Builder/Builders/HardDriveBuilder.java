package Builder.Builders;

import Builder.Components.DriveType;
import Builder.Drives.HardDrive;

public class HardDriveBuilder implements Builder{
    private DriveType type;
    private int storage;
    private int weight;

    @Override
    public void setDriveType(DriveType type) {
        this.type = type;
    }

    @Override
    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public HardDrive getResults() {
        return new HardDrive(type, storage, weight);
    }
}
