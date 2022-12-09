package BuilderTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StorageBuilderTest {
    private Director director;

    private HardDriveBuilder hardDriveBuilder;
    private USBBuilder usbBuilder;

    @Before
    public void startUp() {
        director = new Director();
        hardDriveBuilder = new HardDriveBuilder();
        usbBuilder = new USBBuilder();
    }

    @Test
    public void buildHDDHardDriveTest() {
        director.buildHDDStorage(hardDriveBuilder);
        HardDrive drive = hardDriveBuilder.getResults();
        Assert.assertEquals("HDD", drive.getDriveType());
        Assert.assertEquals(1000, drive.getStorageInGigabye());
        Assert.assertEquals(300, drive.getWeightInGrams());
    }

    @Test
    public void buildSSDHardDrive() {
        director.buildSSDStorage(hardDriveBuilder);
        HardDrive drive = hardDriveBuilder.getResults();
        Assert.assertEquals("SSD", drive.getDriveType());
        Assert.assertEquals(500, drive.getStorageInGigabye());
        Assert.assertEquals(200, drive.getWeightInGrams());
    }

    @Test
    public void buildHDDUSB() {
        director.buildHDDStorage(usbBuilder);
        USB usb = usbBuilder.getResults();
        Assert.assertEquals("HDD usb with 1000GB storage only 50gram", usb.printData());
    }

    @Test
    public void buildSSDUSB() {
        director.buildSSDStorage(usbBuilder);
        USB usb = usbBuilder.getResults();
        Assert.assertEquals("SSD usb with 500GB storage only 20gram", usb.printData());
    }
}
