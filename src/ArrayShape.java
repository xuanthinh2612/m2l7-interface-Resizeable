public class ArrayShape {
    public static void main(String[] args) {
        Shape[] arr = new Shape[6];
        arr[0] = new Square();
        arr[1] = new Circle();
        arr[2] = new Rectangle();
        arr[3] = new Square(10);
        arr[4] = new Circle(15);
        arr[5] = new Rectangle(10, 15);
        System.out.println("pre-resize");
        for(Shape shape: arr){
            System.out.println(shape.getArea());
        }
        System.out.println("after-resize");
        for(Shape shape: arr){
            shape.resize((int) Math.round(Math.random() * (100 - 1) + 1));
            System.out.println(shape.getArea());
        }


//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] instanceof Square) {
//                Square o = (Square) arr[i];
//                System.out.println(o.getArea());
//            } else if (arr[i] instanceof Circle) {
//                Circle o = (Circle) arr[i];
//                System.out.println(o.getArea());
//            } else if (arr[i] instanceof Rectangle) {
//                Rectangle o = (Rectangle) arr[i];
//                System.out.println(o.getArea());
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            arr[i].resize((int) Math.round(Math.random() * (100 - 1) + 1));
//        }
//        System.out.println("after-increase");
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] instanceof Square) {
//                Square o = (Square) arr[i];
//                System.out.println(o.getArea());
//            } else if (arr[i] instanceof Circle) {
//                Circle o = (Circle) arr[i];
//                System.out.println(o.getArea());
//            } else if (arr[i] instanceof Rectangle) {
//                Rectangle o = (Rectangle) arr[i];
//                System.out.println(o.getArea());
//            }
//        }


    }
}
