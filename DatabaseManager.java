public class DatabaseManager {
    private static DatabaseManager instance;
    private int connectionCount;

    //questo è il costruttore privato
    private DatabaseManager(){
        connectionCount = 0;
    }

    //metodo static per ottenere l'unica istanza
    public static DatabaseManager getInstance(){
        if(instance == null){
            instance = new DatabaseManager();
        }
        return instance;
    }

    //metodo per simulare una connessione
    public void connect(){
        connectionCount++;
        System.out.println("Connessione stabilita. Connessioni attive: " + connectionCount);
    }

    //metodo per restituire il numero totale di connessioni effettuate
    public int getConnectionCount(){
        return connectionCount;
    }
}
