/*
 * @(#)UserBuilder.java 1.0 Oct 05, 2017
 */
package builder;

import data.RegistrationData;
import data.UserProfile;
import domain.User;

/**
 * <code>UserBuilder</code> class is  Builder Class for User.
 * <p>
 * <p>
 * <pre>
 * <strong>History</strong>    Name              Date            Description
 * <strong>History</strong>    --------------------------------------------------------------------
 * <strong>History</strong>   Pratyush Giri    10/5/17
 * </pre>
 *
 * @author Pratyush Giri
 * @since Oct 05, 2017
 */
public class UserProfileBuilder {

    private RegistrationData registrationData;

    private User user;

    public UserProfileBuilder registrationData(RegistrationData data) {
        this.registrationData = data;
        return this;
    }

    public UserProfileBuilder user(User u) {
        this.user = u;
        return this;
    }


    public User buildUser(){
        if (registrationData == null) {
            return null;
        }

        User user = new User();
        user.setFirstName(registrationData.getFirstName());
        user.setLastName(registrationData.getLastName());
        user.setEmail(registrationData.getEmail());
        user.setDob(registrationData.getDob());
        user.setGender(registrationData.getGender());
        user.setPhone(registrationData.getPhone());
        user.setPassword(registrationData.getPassword());

        return user;
    }

    public UserProfile build() {

        if (registrationData == null) {
            return null;
        }

        UserProfile profile = new UserProfile();
        profile.setFirstName(registrationData.getFirstName());
        profile.setLastName(registrationData.getLastName());
        profile.setEmail(registrationData.getEmail());
        profile.setDob(registrationData.getDob());
        char gender = registrationData.getGender();
        profile.setGender(gender == 'M' ? "Male" : gender == 'F' ? "Female" : gender == 'O' ? "Others" : "Rather Not Say");
        profile.setPhone(registrationData.getPhone());

        return profile;
    }
    public UserProfile build2() {

        if (user == null) {
            return null;
        }

        UserProfile profile = new UserProfile();
        profile.setFirstName(user.getFirstName());
        profile.setLastName(user.getLastName());
        profile.setEmail(user.getEmail());
        profile.setDob(user.getDob());
        char gender = user.getGender();
        profile.setGender(gender == 'M' ? "Male" : gender == 'F' ? "Female" : gender == 'O' ? "Others" : "Rather Not Say");
        profile.setPhone(user.getPhone());

        return profile;
    }

}



