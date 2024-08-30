public class Event {
    //properties
    private int id;
    private String title;
    private String location;
    private String date;
    private String type;
    //constructor
    public Event(int id,String title,String location,String date,String type){

        this.id = id;
        this.title = title;
        this.location = location;
        this.date = date;
        this.type = type;

    }
    //geters
    public int GetId(){
        return this.id;
    }
    public String GetTitle(){
        return this.title;
    }
    public String GetLocation(){
        return this.location;
    }
    public String GetDate(){
        return this.date;
    }
    public String GetType(){
        return this.type;
    }

    //seters
    public void SetTitle(String title){
        this.title =  title;
    }
    public void SetLocation(String location){
        this.location =  location;
    }
    public void SetDate(String date){
        this.date =  date;
    }
    public void SetType(String type){
        this.type =  type;
    }
    
}
