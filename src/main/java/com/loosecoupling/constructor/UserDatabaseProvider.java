package com.loosecoupling.constructor;

public class UserDatabaseProvider implements UserDataProvider {


    @Override
    public String userDetails(){
        return
                "User Details from Database";
    }
}
