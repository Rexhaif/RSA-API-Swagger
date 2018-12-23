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
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import javax.validation.constraints.*;

/**
 * Body1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T17:59:28.366Z[GMT]")public class Body1   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("parent_id")
  private UUID parentId = null;

  public Body1 title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @JsonProperty("title")
  @Schema(required = true, description = "")
  @NotNull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Body1 parentId(UUID parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
   **/
  @JsonProperty("parent_id")
  @Schema(description = "")
  public UUID getParentId() {
    return parentId;
  }

  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body1 body1 = (Body1) o;
    return Objects.equals(this.title, body1.title) &&
        Objects.equals(this.parentId, body1.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, parentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body1 {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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
