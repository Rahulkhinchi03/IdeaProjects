package Inheritance.Pool;

public class Rectangle {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(5, 10);
            System.out.println("rectangle.width= " + rectangle.getWidth());
            System.out.println("rectangle.length= " + rectangle.getLength());
            System.out.println("rectangle.area= " + rectangle.getArea());
            Cuboid cuboid = new Cuboid(5,10,5);
            System.out.println("cuboid.width= " + cuboid.getWidth());
            System.out.println("cuboid.length= " + cuboid.getLength());
            System.out.println("cuboid.area= " + cuboid.getArea());
            System.out.println("cuboid.height= " + cuboid.getHeight());
            System.out.println("cuboid.volume= " + cuboid.getVolume());


        }
        private double width;
        private double length;

        public Rectangle(double width, double length) {
            if (width < 0 && length > 0) {
                this.width = 0;
                this.length = length;
            }
            else if (width > 0 && length < 0 )  {
                this.width = width;
                this.length = 0;
            }
            else if (width < 0 && length < 0) {
                this.width = 0;
                this.length = 0;
            }
            else {
                this.width = width;
                this.length = length;
            }

        }

        public double getWidth() {
            return width;
        }

        public double getLength() {
            return length;
        }
        public double getArea() {
            return getLength() * getWidth();
        }
    }


