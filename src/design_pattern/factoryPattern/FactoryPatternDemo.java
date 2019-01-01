package design_pattern.factoryPattern;

public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        // 获取Circle的对象，并调用它的Draw方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // 同上
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // 同上
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

    }
}
