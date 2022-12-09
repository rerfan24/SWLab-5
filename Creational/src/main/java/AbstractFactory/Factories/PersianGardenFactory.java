package AbstractFactory.Factories;

import AbstractFactory.Flowers.Flower;
import AbstractFactory.Flowers.KhatmiFlower;
import AbstractFactory.Trees.ChenarTree;
import AbstractFactory.Trees.Tree;

public class PersianGardenFactory implements GardenFactory{
    @Override
    public Tree plantTree() {
        return new ChenarTree();
    }

    @Override
    public Flower plantFlower() {
        return new KhatmiFlower();
    }
}
