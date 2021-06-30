package com.company.users;

public class User {

    private String userName;
    private String password;
    private String mailId;
    private String address;

    public User(String userName, String password, String mailId, String address) {
        this.userName = userName;
        this.password = password;
        this.mailId = mailId;
        this.address = address;
    }
    public User() {
        // nothing
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean updateUserDetails(User user){
        boolean flag;
        if (user == null){
            return false;
        }
        return true;
    }

    public User login(String userName, String password){
        boolean flag;
        System.out.println(toString());
        if (userName.equals(this.userName) && password.equals(this.password)) {
            System.out.println(" login successful.. ");
            return this;
        }
        return new User();
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", mailId='" + mailId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
