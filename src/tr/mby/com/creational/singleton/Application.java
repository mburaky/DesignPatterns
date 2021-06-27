package tr.mby.com.creational.singleton;

public class Application {

    public static void main(String[] args) {
        // Database dbClient = new Database(); // 'Database()' has private access in 'tr.mby.com.creational.singleton.Database'

        Database dbClient = Database.getDbClient();

        dbClient.showClient();
        dbClient.showClient();

        // OUTPUT
        // Single object is loading..
        // Db client is active
        // Db client is active
    }
}
