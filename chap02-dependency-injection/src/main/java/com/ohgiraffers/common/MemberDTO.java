package com.ohgiraffers.common;

import lombok.*;

//memberDTO = ObjectMapper(UserDTO)getUser(); //이름만 맞으면 자동으로 맺어주지만 성능이 낮음
//@Data //이거하면 자동으로 기본생성자 getset tostring 모두 만들지만 간헐적 에러남
//@NoArgsConstructor //생성하면 자동으로 만들어줌
//@AllArgsConstructor
//@ToString
//@Builder //Builder를 쓰면 setter를 안써도됨 xml에서 property가 있으면 setter를 써야됨 그래서 뭘 참조하는지도 구별 해야됨
//@Getter
//@Setter
@Builder
public class MemberDTO {

    private int seq;
    private String name;
    private String phone;
    private String email;
    private Account personalAccount;

    public MemberDTO() {
    }

    public MemberDTO(int seq, String name, String phone, String email, Account personalAccount) {
        this.seq = seq;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.personalAccount = personalAccount;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getPersonalAccount() {
        return personalAccount;
    }

    public void setPersonalAccount(Account personalAccount) {
        this.personalAccount = personalAccount;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "seq=" + seq +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", personalAccount=" + personalAccount +
                '}';
    }
}