package task2;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class TwitterClient implements Client{
    private final TwitterUser user;

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return LocalDate.parse(user.getLastActiveTime());
    }
}
