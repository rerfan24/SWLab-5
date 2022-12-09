package Builder;

import Builder.Builders.Builder;
import Builder.Components.DriveType;

public class Director {
    public void buildHDDStorage(Builder builder) {
        builder.setDriveType(DriveType.HDD);
        builder.setStorage(1000);
        builder.setWeight(300);
    }

    public void buildSSDStorage(Builder builder) {
        builder.setDriveType(DriveType.SSD);
        builder.setStorage(500);
        builder.setWeight(200);
    }

    public void buildLightHDDStorage(Builder builder) {
        builder.setDriveType(DriveType.HDD);
        builder.setStorage(64);
        builder.setWeight(50);
    }

    public void buildLightSSDStorage(Builder builder) {
        builder.setDriveType(DriveType.SSD);
        builder.setStorage(16);
        builder.setWeight(20);
    }
}
