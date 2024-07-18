package com.loosecoupling.constructor;

public class WebServiceProvider implements UserDataProvider {
    @Override
    public String userDetails(){
        return "Fetching Data from Webservices";
    }
}
