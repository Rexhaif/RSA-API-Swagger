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
 * InlineResponse2011
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T18:38:52.268Z[GMT]")public class InlineResponse2011   {
  @JsonProperty("dict_id")
  private UUID dictId = null;

  public InlineResponse2011 dictId(UUID dictId) {
    this.dictId = dictId;
    return this;
  }

  /**
   * Get dictId
   * @return dictId
   **/
  @JsonProperty("dict_id")
  @Schema(description = "")
  public UUID getDictId() {
    return dictId;
  }

  public void setDictId(UUID dictId) {
    this.dictId = dictId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2011 inlineResponse2011 = (InlineResponse2011) o;
    return Objects.equals(this.dictId, inlineResponse2011.dictId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dictId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2011 {\n");
    
    sb.append("    dictId: ").append(toIndentedString(dictId)).append("\n");
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
