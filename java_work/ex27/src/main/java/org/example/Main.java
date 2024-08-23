package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MemberDto.MemberReqDto memberReqDto
                = new MemberDto.MemberReqDto("홍길동", 20);

        System.out.println(memberReqDto);

        MemberDto.MemberResDto memberResDto
                = new MemberDto.MemberResDto("호연희",20);

        System.out.println(memberResDto);
    }
}