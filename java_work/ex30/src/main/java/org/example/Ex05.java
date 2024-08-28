package org.example;

import java.util.Optional;

class ContInfo {
    String phone;
    String address;

    public ContInfo(String phone, String addres) {
        this.phone = phone;
        this.address = addres;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddres() {
        return address;
    }
}


public class Ex05 {
    public static void main(String[] args) {

        Optional<ContInfo> contInfo = Optional.of(
                new ContInfo(null, "KOREA DAEGU")
        );

        String phone = contInfo
                .map(contInfo1 -> contInfo1.getPhone())
                .orElse("There is no Phone Number");

        System.out.println("phone = "+phone);

        String address = contInfo
                .map(contInfo1 -> contInfo1.getAddres())
                .orElse("no address");
        System.out.println("address = "+address);

//        String phone = null;
//        String address = null;
//
//        if (contInfo.getPhone() != null)
//            phone = contInfo.getPhone();
//
//        else phone = "ENPTY";
//
//        if (contInfo.getAddres() != null)
//            address = contInfo.getAddres();
//        else address = "ENPTY";
//
//        System.out.println("phone =" + phone);
//        System.out.println("address =" + address);
    }
}
