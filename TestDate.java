public class TestDate {
    public static void main(String[] args) {
        Date date = new Date(1, 1, 2023);

        System.out.println("Date: "+ date.toString());
        date.setDay(25);
        date.setMonth(12);
        date.setYear(2025);

        System.out.println("Edited Date: "+ date.toString());
    }
}