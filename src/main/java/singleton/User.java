package singleton;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String email;
    private int age;

    public void save(){
        DBConnetction dbConnetction = DBConnetction.getInstance();
        dbConnetction.executeQuery(
                "insert into user (email, name, age) values ('roman@ucu.edu.ua', 'Roman', 19);");
    }
}
