package org.example.friend;

public class UnlFriend extends Friend{
    private String major;

    public UnlFriend(String name, String phone, String major) {
        super(name,phone);
        this.major = major;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("전공 = "+major);
    }

    @Override
    public String toString() {
        return "UnlFriend{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
