package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider userDatabase = new UserDatabase();
        UserManager userManagerDb = new UserManager(userDatabase);
        System.out.println(userManagerDb.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceProvider();
        UserManager userManagerWebServices = new UserManager(webServiceProvider);
        System.out.println(userManagerWebServices.getUserInfo());

        UserDataProvider newDatabaseProvide = new NewDatabaseProvider();
        UserManager userManagerNewDatabase = new UserManager(newDatabaseProvide);
        System.out.println(userManagerNewDatabase.getUserInfo());
    }
}
