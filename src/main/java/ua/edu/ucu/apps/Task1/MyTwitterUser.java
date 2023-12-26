package ua.edu.ucu.apps.Task1;

public class MyTwitterUser implements User{
    public TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return twitterUser.getEmail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public String getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }  
}
