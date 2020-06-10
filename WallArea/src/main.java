public class main {

    public static void main(String[] args) {

        Wall wall= new Wall(2,4);

        System.out.println("Area is " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());
    }
}
