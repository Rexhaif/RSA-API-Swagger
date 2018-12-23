/*
 * API Машины RSA
 * API системы реляционно-ситуационного анализа текстов
 *
 * OpenAPI spec version: 3.0.0
 * Contact: rexhaif.io@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.EntityStatistic;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T17:59:28.366Z[GMT]")public class InlineResponse200   {
  @JsonProperty("stat_name")
  private String statName = null;

  @JsonProperty("stat_values")
  private List<EntityStatistic> statValues = null;

  public InlineResponse200 statName(String statName) {
    this.statName = statName;
    return this;
  }

  /**
   * Get statName
   * @return statName
   **/
  @JsonProperty("stat_name")
  @Schema(description = "")
  public String getStatName() {
    return statName;
  }

  public void setStatName(String statName) {
    this.statName = statName;
  }

  public InlineResponse200 statValues(List<EntityStatistic> statValues) {
    this.statValues = statValues;
    return this;
  }

  public InlineResponse200 addStatValuesItem(EntityStatistic statValuesItem) {
    if (this.statValues == null) {
      this.statValues = new ArrayList<EntityStatistic>();
    }
    this.statValues.add(statValuesItem);
    return this;
  }

  /**
   * Get statValues
   * @return statValues
   **/
  @JsonProperty("stat_values")
  @Schema(description = "")
  public List<EntityStatistic> getStatValues() {
    return statValues;
  }

  public void setStatValues(List<EntityStatistic> statValues) {
    this.statValues = statValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.statName, inlineResponse200.statName) &&
        Objects.equals(this.statValues, inlineResponse200.statValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statName, statValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    statName: ").append(toIndentedString(statName)).append("\n");
    sb.append("    statValues: ").append(toIndentedString(statValues)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
