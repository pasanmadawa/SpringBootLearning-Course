package com.loose.coupling;

public class NewDatabaseProvider implements UserDataProvider{

    @Override
    public String userDetails(){
        return "New Database in action";
    }
}
