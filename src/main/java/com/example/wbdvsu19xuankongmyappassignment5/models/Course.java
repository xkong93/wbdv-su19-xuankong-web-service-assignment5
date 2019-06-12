package com.example.wbdvsu19xuankongmyappassignment5.models;

/**
 * @author Xuan Kong
 * @Date 2019-06-10.
 */
public class Course {
  private Integer id;
  private String titile;

  public Course(){

  }
  public Course(Integer id, String titile) {
    super();
    this.id = id;
    this.titile = titile;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitile() {
    return titile;
  }

  public void setTitile(String titile) {
    this.titile = titile;
  }


}
