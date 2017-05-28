package jtk.cucumber.transformers;

import cucumber.api.Transformer;
import jtk.users.User;

/**
 * Created by jubin on 5/28/2017.
 */
public class UserTransformer extends Transformer<User> {

    @Override
    public User transform(String value) {
        return new User(value);
    }
}
