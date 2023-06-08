/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package tarik.LK.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import tarik.LK.utils.SpeakeasyMetadata;

public class StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public tarik.LK.models.shared.OrderStatus orderStatus;

    public StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostRequest withOrderStatus(tarik.LK.models.shared.OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=order_id")
    public Long orderId;

    public StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostRequest withOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    
    public StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostRequest(@JsonProperty("OrderStatus") tarik.LK.models.shared.OrderStatus orderStatus, @JsonProperty("order_id") Long orderId) {
        this.orderStatus = orderStatus;
        this.orderId = orderId;
  }
}
