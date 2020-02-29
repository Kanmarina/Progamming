package day44;

public class SlackUser {

protected String name;
  protected  String status;

    public void sendMessage(){
        System.out.println("Hello "+name) ;
    }
    public void call(){
        System.out.println(name+"235414567");
    }

    public SlackUser(String name, String status) {
        this.name = name;
        this.status = status;
    }
}
