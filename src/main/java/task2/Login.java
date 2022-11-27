package task2;

import java.time.LocalDate;

public class Login {
    public Client login(String loginMethod){
        if (loginMethod.equals("twitter")){
            return new TwitterClient(new TwitterUser("roman@gmail.com", "Ukraine", "21-11-2022"));
        }else if (loginMethod.equals("facebook")){
            return new FacebookClient(new FacebookUser("roman_faceb@gmail.com", Country.Ukraine, LocalDate.now()));
        }
        return null;
    }
}
