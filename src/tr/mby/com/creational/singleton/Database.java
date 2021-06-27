package tr.mby.com.creational.singleton;

public class Database {

    private static Database dbClient;

    private Database() {}

    public static Database getDbClient() {
        if (dbClient == null) {
            System.out.println("Single object is loading..");
            return new Database();
        }
        return dbClient;
    }

    public void showClient() {
        System.out.println("Db client is active");
    }
}
