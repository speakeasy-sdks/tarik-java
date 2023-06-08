/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package tarik.LK.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response - Successful Response
 */
public class Response {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public java.util.Map<String, Object> data;

    public Response withData(java.util.Map<String, Object> data) {
        this.data = data;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    public String[] errors;

    public Response withErrors(String[] errors) {
        this.errors = errors;
        return this;
    }
    
    @JsonProperty("success")
    public Boolean success;

    public Response withSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    
    public Response(@JsonProperty("success") Boolean success) {
        this.success = success;
  }
}
