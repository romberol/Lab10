package task3;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Login login = new Login();
        if (login.login(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
