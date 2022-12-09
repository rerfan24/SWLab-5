package AbstractFactory.Factories;

import AbstractFactory.Flowers.Flower;
import AbstractFactory.Trees.Tree;

public interface GardenFactory {
    Tree plantTree();
    Flower plantFlower();
}
