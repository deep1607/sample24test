package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.model.GetCardAccountEnquiryResponseTns;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetCardAccountEnquiryOutput
 */


public class GetCardAccountEnquiryOutput   {
  @JsonProperty("Body")
  private GetCardAccountEnquiryResponseTns body = null;

  public GetCardAccountEnquiryOutput body(GetCardAccountEnquiryResponseTns body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
  */
  @ApiModelProperty(value = "")

  @Valid

  public GetCardAccountEnquiryResponseTns getBody() {
    return body;
  }

  public void setBody(GetCardAccountEnquiryResponseTns body) {
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
    GetCardAccountEnquiryOutput getCardAccountEnquiryOutput = (GetCardAccountEnquiryOutput) o;
    return Objects.equals(this.body, getCardAccountEnquiryOutput.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCardAccountEnquiryOutput {\n");
    
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

