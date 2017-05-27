package jtk.users;

import jtk.site.pages.Page;

/**
 * Created by jubin on 5/27/2017.
 */
public class User {

    private final String username;
    private Page currentPage;
    private boolean isPremium;

    public User(String user) {
        this.username = user;
    }

    public Page getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Page currentPage) {
        this.currentPage = currentPage;
    }

    public String getUsername() {
        return username;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", currentPage=" + currentPage +
                ", isPremium=" + isPremium +
                '}';
    }
}
