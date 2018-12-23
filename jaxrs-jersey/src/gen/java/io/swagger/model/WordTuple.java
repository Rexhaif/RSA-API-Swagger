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
 * WordTuple
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T17:59:28.366Z[GMT]")public class WordTuple   {
  @JsonProperty("document_id")
  private UUID documentId = null;

  @JsonProperty("word")
  private String word = null;

  @JsonProperty("context")
  private String context = null;

  public WordTuple documentId(UUID documentId) {
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

  public WordTuple word(String word) {
    this.word = word;
    return this;
  }

  /**
   * Get word
   * @return word
   **/
  @JsonProperty("word")
  @Schema(example = "других", required = true, description = "")
  @NotNull
  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public WordTuple context(String context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
   **/
  @JsonProperty("context")
  @Schema(example = "других для кого-то в постоянно <b>меняющимся</b> мире ?", required = true, description = "")
  @NotNull
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WordTuple wordTuple = (WordTuple) o;
    return Objects.equals(this.documentId, wordTuple.documentId) &&
        Objects.equals(this.word, wordTuple.word) &&
        Objects.equals(this.context, wordTuple.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, word, context);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordTuple {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
