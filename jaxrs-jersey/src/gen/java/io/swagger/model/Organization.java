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
import io.swagger.model.Member;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.validation.constraints.*;

/**
 * Organization
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2018-12-23T17:59:28.366Z[GMT]")public class Organization   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("manager_id")
  private UUID managerId = null;

  @JsonProperty("parent_id")
  private UUID parentId = null;

  @JsonProperty("members")
  private List<Member> members = null;

  public Organization id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty("id")
  @Schema(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, description = "")
  @NotNull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Organization title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @JsonProperty("title")
  @Schema(example = "Филологический факультет МГУ", required = true, description = "")
  @NotNull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Organization managerId(UUID managerId) {
    this.managerId = managerId;
    return this;
  }

  /**
   * Get managerId
   * @return managerId
   **/
  @JsonProperty("manager_id")
  @Schema(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, description = "")
  @NotNull
  public UUID getManagerId() {
    return managerId;
  }

  public void setManagerId(UUID managerId) {
    this.managerId = managerId;
  }

  public Organization parentId(UUID parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
   **/
  @JsonProperty("parent_id")
  @Schema(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", description = "")
  public UUID getParentId() {
    return parentId;
  }

  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }

  public Organization members(List<Member> members) {
    this.members = members;
    return this;
  }

  public Organization addMembersItem(Member membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<Member>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * Get members
   * @return members
   **/
  @JsonProperty("members")
  @Schema(description = "")
  public List<Member> getMembers() {
    return members;
  }

  public void setMembers(List<Member> members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.id, organization.id) &&
        Objects.equals(this.title, organization.title) &&
        Objects.equals(this.managerId, organization.managerId) &&
        Objects.equals(this.parentId, organization.parentId) &&
        Objects.equals(this.members, organization.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, managerId, parentId, members);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
