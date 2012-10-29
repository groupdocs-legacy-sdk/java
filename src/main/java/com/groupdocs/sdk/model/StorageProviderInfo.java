package com.groupdocs.sdk.model;

import java.util.*;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class StorageProviderInfo {
  private String publicKey = null;
  private Double id = null;
  private String serviceHost = null;
  private Boolean isPrimary = null;
  private String privateKey = null;
  private List<Integer> token = new ArrayList<Integer>();
  private String rootFolder = null;
  private String provider = null;
  private String type = null;
  public String getPublicKey() {
    return publicKey;
  }
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  public String getServiceHost() {
    return serviceHost;
  }
  public void setServiceHost(String serviceHost) {
    this.serviceHost = serviceHost;
  }

  public Boolean getIsPrimary() {
    return isPrimary;
  }
  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }

  public String getPrivateKey() {
    return privateKey;
  }
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public List<Integer> getToken() {
    return token;
  }
  public void setToken(List<Integer> token) {
    this.token = token;
  }

  public String getRootFolder() {
    return rootFolder;
  }
  public void setRootFolder(String rootFolder) {
    this.rootFolder = rootFolder;
  }

  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageProviderInfo {\n");
    sb.append("  publicKey: ").append(publicKey).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  serviceHost: ").append(serviceHost).append("\n");
    sb.append("  isPrimary: ").append(isPrimary).append("\n");
    sb.append("  privateKey: ").append(privateKey).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  rootFolder: ").append(rootFolder).append("\n");
    sb.append("  provider: ").append(provider).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
