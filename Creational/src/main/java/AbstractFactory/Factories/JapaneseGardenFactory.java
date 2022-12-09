package AbstractFactory.Factories;

import AbstractFactory.Flowers.Flower;
import AbstractFactory.Flowers.G1Flower;
import AbstractFactory.Trees.J1Tree;
import AbstractFactory.Trees.Tree;

public class JapaneseGardenFactory implements GardenFactory{
    @Override
    public Tree plantTree() {
        return new J1Tree();
    }

    @Override
    public Flower plantFlower() {
        return new G1Flower();
    }
}
