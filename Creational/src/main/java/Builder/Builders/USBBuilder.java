package Builder.Builders;

import Builder.Components.DriveType;
import Builder.Drives.USB;

public class USBBuilder implements Builder{
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

    public USB getResults() {
        return new USB(type, storage, weight);
    }
}
