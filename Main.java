public class Main {

    public static void main(String[] args) {
        try {
            Tester.start(Tests.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
