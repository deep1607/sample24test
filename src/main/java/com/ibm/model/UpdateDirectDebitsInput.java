package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.model.UpdateDirectDebitsTns;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateDirectDebitsInput
 */


public class UpdateDirectDebitsInput   {
  @JsonProperty("Body")
  private UpdateDirectDebitsTns body = null;

  public UpdateDirectDebitsInput body(UpdateDirectDebitsTns body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UpdateDirectDebitsTns getBody() {
    return body;
  }

  public void setBody(UpdateDirectDebitsTns body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDirectDebitsInput updateDirectDebitsInput = (UpdateDirectDebitsInput) o;
    return Objects.equals(this.body, updateDirectDebitsInput.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDirectDebitsInput {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

