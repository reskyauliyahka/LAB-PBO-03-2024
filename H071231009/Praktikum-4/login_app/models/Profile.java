package login_app.models;

import login_app.utils.StringUtils;

public class Profile {
    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
    private String nickName;
    private String email;
    private String fullName;
    private String hobby;
    private int age;
    
    public Profile() {};
    
    public Profile(String nickName, String email, String fullName, int age) {
        this.nickName = StringUtils.getNickName(fullName);
        this.email = email;
        this.fullName = fullName;
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setnickName(String nickName) {
        this.nickName = nickName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}