package BDD;

public interface Iconnexions {

    /// fermer une connexion
    void closeConnection() throws Exception;

    /// Lancer une transaction avec une BD
    void connectTransaction() throws Exception;

    ///  Executer la transaction courante
    void executeTransaction() throws Exception;

    ///   Annule la transaction courante
    void disconnectTransaction() throws Exception;
}
