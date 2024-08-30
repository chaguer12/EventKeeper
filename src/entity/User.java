public class User {
    
    private  Int Id;
    private String name;
    private String password;
    private boolean role;

    public User(Int Id,String name,boolean role){
        this.Id = Id;
        this.name = name;
        this.password = password;
        this.role = role;

    }


    public Int GetId(){
        return this.Id;
    }
    public String GetName(){
        return this.name;
    }
    public boolean GetRole(){
        return this.role;
    }
    public String GetPassword(){
        return this.password;
    }

    public SetName(String name){
        this.name =  name;
    }
    public SetPassword(String password){
        this.password =  password;
    }
    public SetRole(boolean role){
        this.role =  role;
    }

    
}
