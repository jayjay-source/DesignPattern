public class Main {
    public static void main(String[] args) {
        //voglio simulare un po' di connessioni da più punti del mio programma
        DatabaseManager db1 = DatabaseManager.getInstance();
        db1.connect();

        DatabaseManager db2 = DatabaseManager.getInstance();
        db2.connect();

        DatabaseManager db3 = DatabaseManager.getInstance();
        db3.connect();

        //verifico che sia sempre la stessa instanza
        System.out.println("db1 == db2?" + (db1 == db2));//sarà sempre vero
        System.out.println("db1 == db2?" + (db2 == db3));//sarà sempre vero

        //totale delle connessioni
        System.out.println("Connessioni attive: " + db1.getConnectionCount());

    }
}
