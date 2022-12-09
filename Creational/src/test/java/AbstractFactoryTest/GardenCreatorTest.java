package AbstractFactoryTest;

import AbstractFactory.AbstractFactoryClient;
import AbstractFactory.Factories.GardenFactory;
import AbstractFactory.Factories.JapaneseGardenFactory;
import AbstractFactory.Factories.PersianGardenFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class GardenCreatorTest {
    private AbstractFactoryClient abstractFactoryClient;
    private GardenFactory gardenFactory;

    @Test
    public void CreateJapaneseGarden() {
        gardenFactory = new JapaneseGardenFactory();
        abstractFactoryClient = new AbstractFactoryClient(gardenFactory);
        Assert.assertEquals("G1", abstractFactoryClient.getGardenFlowerInfo());
        Assert.assertEquals("J1", abstractFactoryClient.getGardenTreeInfo());
    }

    @Test
    public void CreatePersianGarden() {
        gardenFactory = new PersianGardenFactory();
        abstractFactoryClient = new AbstractFactoryClient(gardenFactory);
        Assert.assertEquals("Khatmi", abstractFactoryClient.getGardenFlowerInfo());
        Assert.assertEquals("Chenar", abstractFactoryClient.getGardenTreeInfo());
    }
}
