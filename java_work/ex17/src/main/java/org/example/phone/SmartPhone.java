package org.example.phone;

public class SmartPhone extends MobilePhone {

    private  String androidVer;

    public SmartPhone(String aver,int number) {
        super(number);
        this.androidVer = aver;
    }

    // 재정의
    @Override
    public void show(){
        super.show();
        System.out.println("androidVer ="+androidVer);

    }

}
