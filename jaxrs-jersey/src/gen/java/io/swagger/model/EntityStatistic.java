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
import io.swagger.model.EntityStatisticEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import javax.validation.constraints.*;

/**
 * EntityStatistic
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T17:59:28.366Z[GMT]")public class EntityStatistic   {
  @JsonProperty("entity")
  private EntityStatisticEntity entity = null;

  @JsonProperty("statistic")
  private BigDecimal statistic = null;

  public EntityStatistic entity(EntityStatisticEntity entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Get entity
   * @return entity
   **/
  @JsonProperty("entity")
  @Schema(required = true, description = "")
  @NotNull
  public EntityStatisticEntity getEntity() {
    return entity;
  }

  public void setEntity(EntityStatisticEntity entity) {
    this.entity = entity;
  }

  public EntityStatistic statistic(BigDecimal statistic) {
    this.statistic = statistic;
    return this;
  }

  /**
   * Get statistic
   * @return statistic
   **/
  @JsonProperty("statistic")
  @Schema(example = "6798.0", required = true, description = "")
  @NotNull
  public BigDecimal getStatistic() {
    return statistic;
  }

  public void setStatistic(BigDecimal statistic) {
    this.statistic = statistic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityStatistic entityStatistic = (EntityStatistic) o;
    return Objects.equals(this.entity, entityStatistic.entity) &&
        Objects.equals(this.statistic, entityStatistic.statistic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, statistic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityStatistic {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
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
