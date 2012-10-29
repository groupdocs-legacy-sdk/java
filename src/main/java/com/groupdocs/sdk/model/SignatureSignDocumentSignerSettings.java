package com.groupdocs.sdk.model;

/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureSignDocumentSignerSettings {
  private Double height = null;
  private String placeSingatureOn = null;
  private Double width = null;
  private String name = null;
  private String data = null;
  private Double left = null;
  private Double top = null;
  public Double getHeight() {
    return height;
  }
  public void setHeight(Double height) {
    this.height = height;
  }

  public String getPlaceSingatureOn() {
    return placeSingatureOn;
  }
  public void setPlaceSingatureOn(String placeSingatureOn) {
    this.placeSingatureOn = placeSingatureOn;
  }

  public Double getWidth() {
    return width;
  }
  public void setWidth(Double width) {
    this.width = width;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  public Double getLeft() {
    return left;
  }
  public void setLeft(Double left) {
    this.left = left;
  }

  public Double getTop() {
    return top;
  }
  public void setTop(Double top) {
    this.top = top;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureSignDocumentSignerSettings {\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("  placeSingatureOn: ").append(placeSingatureOn).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  left: ").append(left).append("\n");
    sb.append("  top: ").append(top).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
