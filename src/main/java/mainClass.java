public class mainClass {


    public static final String GOOGLE_COM = "https://www.google.com/";
    public static final String JSONPLACEHOLDER_TYPICODE_COM = "https://jsonplaceholder.typicode.com/";

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main started....");

        UiTest.openPage(GOOGLE_COM);

        ApiTest.sendGetRequest(JSONPLACEHOLDER_TYPICODE_COM);

        System.out.println("Method main finished....");

    }
}
