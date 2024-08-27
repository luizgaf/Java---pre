package bank;

public class UserData{
    private static String name;
    private static String account;

    public UserData( String name, String account){
        this.name = name;
        this.account = account;
    }

    public static String GetName(){
        return name;
    }

    public static String GetAccount(){
        return account;
    }
}