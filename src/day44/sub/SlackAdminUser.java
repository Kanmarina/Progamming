package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {

    int adminId;

    public void sendAtChannelMessage(){
        System.out.println("My message ");
    }
    public void deleteMessage(){

    }
    public void addChannel(){

    }


    public SlackAdminUser(String name, String status, int adminId) {
        super(name, status);
        this.adminId = adminId;
    }

    public static void main(String[] args) {
        SlackAdminUser s1 =new SlackAdminUser("Akbar","release your horse",101);

        s1.status = "available";
        System.out.println("s1.status = " + s1.status);

        s1.addChannel();
        s1.deleteMessage();
        s1.sendAtChannelMessage();

        s1.call();
        s1.sendMessage();
    }
}
