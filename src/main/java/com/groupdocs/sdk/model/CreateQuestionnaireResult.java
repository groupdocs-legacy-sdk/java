package com.groupdocs.sdk.model;

/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class CreateQuestionnaireResult {
  private Double questionnaire_id = null;
  private String adjusted_name = null;
  public Double getQuestionnaire_id() {
    return questionnaire_id;
  }
  public void setQuestionnaire_id(Double questionnaire_id) {
    this.questionnaire_id = questionnaire_id;
  }

  public String getAdjusted_name() {
    return adjusted_name;
  }
  public void setAdjusted_name(String adjusted_name) {
    this.adjusted_name = adjusted_name;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateQuestionnaireResult {\n");
    sb.append("  questionnaire_id: ").append(questionnaire_id).append("\n");
    sb.append("  adjusted_name: ").append(adjusted_name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
