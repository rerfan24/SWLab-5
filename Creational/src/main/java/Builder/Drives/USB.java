package Builder.Drives;

import Builder.Components.DriveType;

public class USB {
    private final DriveType driveType;
    private final int storage;
    private final int weight;

    public USB(DriveType driveType, int storage, int weight) {
        this.driveType = driveType;
        this.storage = storage;
        this.weight = weight;
    }

    public String printData() {
        return (driveType +
                " usb with " +
                storage +
                "GB storage only " +
                weight +
                "gram");
    }
}
