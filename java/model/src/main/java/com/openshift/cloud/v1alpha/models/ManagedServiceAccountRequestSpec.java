package com.openshift.cloud.v1alpha.models;

import java.util.HashMap;
import java.util.Map;

public class ManagedServiceAccountRequestSpec {

  private String serviceAccountName;
  private Boolean reset;
  private String description;
  private String serviceAccountSecretName;
  private String accessTokenSecretName = "rhoas_binding_operator_token";

  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  /** No args constructor for use in serialization */
  public ManagedServiceAccountRequestSpec() {}

  public String getAccessTokenSecretName() {
    return accessTokenSecretName;
  }

  public void setAccessTokenSecretName(String accessTokenSecretName) {
    this.accessTokenSecretName = accessTokenSecretName;
  }

  /**
   * @param serviceAccountSecretName
   * @param serviceAccountName
   * @param reset
   * @param description
   */
  public ManagedServiceAccountRequestSpec(
      String serviceAccountName,
      Boolean reset,
      String description,
      String serviceAccountSecretName) {
    super();
    this.serviceAccountName = serviceAccountName;
    this.reset = reset;
    this.description = description;
    this.serviceAccountSecretName = serviceAccountSecretName;
  }

  public String getServiceAccountName() {
    return serviceAccountName;
  }

  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }

  public Boolean getReset() {
    return reset;
  }

  public void setReset(Boolean reset) {
    this.reset = reset;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getServiceAccountSecretName() {
    return serviceAccountSecretName;
  }

  public void setServiceAccountSecretName(String serviceAccountSecretName) {
    this.serviceAccountSecretName = serviceAccountSecretName;
  }

  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }
}