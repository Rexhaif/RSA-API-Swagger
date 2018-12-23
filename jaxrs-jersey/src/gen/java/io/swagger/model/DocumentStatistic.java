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
import java.math.BigDecimal;
import java.util.UUID;
import javax.validation.constraints.*;

/**
 * DocumentStatistic
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T18:39:19.625Z[GMT]")public class DocumentStatistic   {
  @JsonProperty("document_id")
  private UUID documentId = null;

  @JsonProperty("statistic")
  private BigDecimal statistic = null;

  public DocumentStatistic documentId(UUID documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Get documentId
   * @return documentId
   **/
  @JsonProperty("document_id")
  @Schema(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, description = "")
  @NotNull
  public UUID getDocumentId() {
    return documentId;
  }

  public void setDocumentId(UUID documentId) {
    this.documentId = documentId;
  }

  public DocumentStatistic statistic(BigDecimal statistic) {
    this.statistic = statistic;
    return this;
  }

  /**
   * Get statistic
   * @return statistic
   **/
  @JsonProperty("statistic")
  @Schema(example = "0.1281", required = true, description = "")
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
    DocumentStatistic documentStatistic = (DocumentStatistic) o;
    return Objects.equals(this.documentId, documentStatistic.documentId) &&
        Objects.equals(this.statistic, documentStatistic.statistic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, statistic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentStatistic {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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
