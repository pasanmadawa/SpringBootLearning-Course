package com.loosecoupling.constructor;



public class NewDatabaseProvider implements UserDataProvider {

    @Override
    public String userDetails(){
        return "New Database in action";
    }
}
