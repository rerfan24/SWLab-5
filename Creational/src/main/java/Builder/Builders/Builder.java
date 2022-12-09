package Builder.Builders;

import Builder.Components.DriveType;

public interface Builder {
    void setDriveType(DriveType type);
    void setStorage(int storage);
    void setWeight(int weight);
}
