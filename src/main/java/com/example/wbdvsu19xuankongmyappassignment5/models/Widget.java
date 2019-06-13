package com.example.wbdvsu19xuankongmyappassignment5.models;

/**
 * @author Xuan Kong
 * @Date 2019-06-10.
 */
public class Widget {
  public enum Type {
    HEADING,
    PARAGRAPH,
    IMAGE,
    LINK,
    LIST,
  }

  public enum DataType {
    Integer,
    String,
    Date,
    Boolean,
  }

  private Long id;
  private Type type;
  private String name;
  private String size;
  private String text;
  private String src;
  private String order;
//  private String width;
//  private String height;
//  private String cssClass;
//  private String style;
//  private String value;
//  private DataType dataType;

  public Widget() {
  }

  public Widget(Long id, Type type, String name, String size, String text, String src, String order) {
    this.id = id;
    this.type = type;
    this.name = name;
    this.size = size;
    this.text = text;
    this.src = src;
    this.order = order;
//    this.width = width;
//    this.height = height;
//    this.cssClass = cssClass;
//    this.style = style;
//    this.value = value;
//    this.dataType = dataType;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

//  public String getWidth() {
//    return width;
//  }
//
//  public void setWidth(String width) {
//    this.width = width;
//  }
//
//  public String getHeight() {
//    return height;
//  }
//
//  public void setHeight(String height) {
//    this.height = height;
//  }
//
//  public String getCssClass() {
//    return cssClass;
//  }
//
//  public void setCssClass(String cssClass) {
//    this.cssClass = cssClass;
//  }
//
//  public String getStyle() {
//    return style;
//  }
//
//  public void setStyle(String style) {
//    this.style = style;
//  }

//  public String getValue() {
//    return value;
//  }
//
//  public void setValue(String value) {
//    this.value = value;
//  }
//
//  public DataType getDataType() {
//    return dataType;
//  }
//
//  public void setDataType(DataType dataType) {
//    this.dataType = dataType;
//  }
}
