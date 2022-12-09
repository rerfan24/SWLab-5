package Builder.Drives;

import Builder.Components.DriveType;

public class HardDrive {
    private final DriveType driveType;
    private final int storage;
    private final int weight;
    private double storageUsed = 0;

    public HardDrive(DriveType driveType, int storage, int weight) {
        this.driveType = driveType;
        this.storage = storage;
        this.weight = weight;
    }

    public DriveType getDriveType() {
        return driveType;
    }

    public int getStorageInGigabye() {
        return storage;
    }

    public int getWeightInGrams() {
        return weight;
    }

    public double getStorageUsed() {
        return storageUsed;
    }
}
