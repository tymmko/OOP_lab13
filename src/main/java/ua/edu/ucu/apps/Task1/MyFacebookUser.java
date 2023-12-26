package ua.edu.ucu.apps.Task1;

public class MyFacebookUser implements User {
    private FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }
    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getCountry();
    }

    @Override
    public String getLastActiveTime() {
        return facebookUser.getLastActiveTime();  
    }
    
}
