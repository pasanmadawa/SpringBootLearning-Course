package com.loose.coupling;

public class UserDatabase implements UserDataProvider {
    @Override
    public String userDetails(){
        return
                "User Details from Database";
    }
}
