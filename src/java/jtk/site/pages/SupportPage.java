package jtk.site.pages;

import jtk.users.User;

import java.util.UUID;

/**
 * Created by jubin on 5/27/2017.
 */
public class SupportPage implements Page {

    private String supportItem;

    @Override
    public PageType getPageType() {
        return PageType.SUPPORT;
    }

    public String getSupportItem() {
        return supportItem;
    }

    public void setSupportItem(String supportItem) {
        this.supportItem = supportItem;
    }

    public String raiseTicket(User user){
        if(user.isPremium())
            return UUID.randomUUID().toString();
        else return null;
    }

    @Override
    public String toString() {
        return "SupportPage{" +
                "supportItem='" + supportItem + '\'' +
                '}';
    }
}
