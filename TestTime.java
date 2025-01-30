public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        System.out.println("t1: " + t1.toString());
        System.out.println("t2: " + t2.toString());

        t1.addSecond();
        t2.removeSecond();

        System.out.println("t1: " + t1.toString());
        System.out.println("t2: " + t2.toString());
    }

    
}