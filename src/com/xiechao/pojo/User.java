package com.xiechao.pojo;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.id
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.username
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.password
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.telephone
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    private String telephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.state
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.premission
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    private String premission;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.id
     *
     * @return the value of users.id
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.id
     *
     * @param id the value for users.id
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.username
     *
     * @return the value of users.username
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.username
     *
     * @param username the value for users.username
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.password
     *
     * @return the value of users.password
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.password
     *
     * @param password the value for users.password
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.telephone
     *
     * @return the value of users.telephone
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.telephone
     *
     * @param telephone the value for users.telephone
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.state
     *
     * @return the value of users.state
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.state
     *
     * @param state the value for users.state
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.premission
     *
     * @return the value of users.premission
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    public String getPremission() {
        return premission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.premission
     *
     * @param premission the value for users.premission
     *
     * @mbggenerated Sun Apr 15 16:02:41 CST 2018
     */
    public void setPremission(String premission) {
        this.premission = premission == null ? null : premission.trim();
    }
}