package AbstractFactory;

import AbstractFactory.Factories.GardenFactory;
import AbstractFactory.Flowers.Flower;
import AbstractFactory.Trees.Tree;

public class AbstractFactoryClient {
    private Flower flower;
    private Tree tree;

    public AbstractFactoryClient(GardenFactory factory) {
        this.flower = factory.plantFlower();
        this.tree = factory.plantTree();
    }

    public String getGardenFlowerInfo() {
        return flower.info();
    }

    public String getGardenTreeInfo() {
        return tree.info();
    }
}
