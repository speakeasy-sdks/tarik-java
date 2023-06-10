# orderStatus

### Available Operations

* [statusRequestValidatedApiV1OrdersOrderIdStatusRequestPost](#statusrequestvalidatedapiv1ordersorderidstatusrequestpost) - Send order status request
* [statusSchemaApiV1OrdersStatusSchemaGet](#statusschemaapiv1ordersstatusschemaget) - Get JSON schema for order status
* [statusValidatedApiV1OrdersOrderIdStatusPost](#statusvalidatedapiv1ordersorderidstatuspost) - Set order status

## statusRequestValidatedApiV1OrdersOrderIdStatusRequestPost

Send order status request

### Example Usage

```java
package hello.world;

import tarik.LK.Lk;
import tarik.LK.models.operations.StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostRequest;
import tarik.LK.models.operations.StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostResponse;
import tarik.LK.models.operations.StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostSecurity;
import tarik.LK.models.shared.OrderStatus;
import tarik.LK.models.shared.OrderStatuses;

public class Application {
    public static void main(String[] args) {
        try {
            Lk sdk = Lk.builder()
                .build();

            StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostRequest req = new StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostRequest(                new OrderStatus(4695L, OrderStatuses.ZERO);, 677817L);            

            StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostResponse res = sdk.orderStatus.statusRequestValidatedApiV1OrdersOrderIdStatusRequestPost(req, new StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostSecurity("excepturi") {{
                oAuth2PasswordBearer = "";
            }});

            if (res.response != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                    | Type                                                                                                                                                                                         | Required                                                                                                                                                                                     | Description                                                                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                                    | [tarik.LK.models.operations.StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostRequest](../../models/operations/StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostRequest.md)   | :heavy_check_mark:                                                                                                                                                                           | The request object to use for the request.                                                                                                                                                   |
| `security`                                                                                                                                                                                   | [tarik.LK.models.operations.StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostSecurity](../../models/operations/StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostSecurity.md) | :heavy_check_mark:                                                                                                                                                                           | The security requirements to use for the request.                                                                                                                                            |


### Response

**[tarik.LK.models.operations.StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostResponse](../../models/operations/StatusRequestValidatedApiV1OrdersOrderIdStatusRequestPostResponse.md)**


## statusSchemaApiV1OrdersStatusSchemaGet

Get JSON schema for order status

### Example Usage

```java
package hello.world;

import tarik.LK.Lk;
import tarik.LK.models.operations.StatusSchemaApiV1OrdersStatusSchemaGetResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Lk sdk = Lk.builder()
                .build();

            StatusSchemaApiV1OrdersStatusSchemaGetResponse res = sdk.orderStatus.statusSchemaApiV1OrdersStatusSchemaGet();

            if (res.response != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[tarik.LK.models.operations.StatusSchemaApiV1OrdersStatusSchemaGetResponse](../../models/operations/StatusSchemaApiV1OrdersStatusSchemaGetResponse.md)**


## statusValidatedApiV1OrdersOrderIdStatusPost

Set order status

### Example Usage

```java
package hello.world;

import tarik.LK.Lk;
import tarik.LK.models.operations.StatusValidatedApiV1OrdersOrderIdStatusPostRequest;
import tarik.LK.models.operations.StatusValidatedApiV1OrdersOrderIdStatusPostResponse;
import tarik.LK.models.operations.StatusValidatedApiV1OrdersOrderIdStatusPostSecurity;
import tarik.LK.models.shared.OrderStatus;
import tarik.LK.models.shared.OrderStatuses;

public class Application {
    public static void main(String[] args) {
        try {
            Lk sdk = Lk.builder()
                .build();

            StatusValidatedApiV1OrdersOrderIdStatusPostRequest req = new StatusValidatedApiV1OrdersOrderIdStatusPostRequest(                new OrderStatus(270008L, OrderStatuses.ONE);, 735194L);            

            StatusValidatedApiV1OrdersOrderIdStatusPostResponse res = sdk.orderStatus.statusValidatedApiV1OrdersOrderIdStatusPost(req, new StatusValidatedApiV1OrdersOrderIdStatusPostSecurity("labore") {{
                oAuth2PasswordBearer = "";
            }});

            if (res.response != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [tarik.LK.models.operations.StatusValidatedApiV1OrdersOrderIdStatusPostRequest](../../models/operations/StatusValidatedApiV1OrdersOrderIdStatusPostRequest.md)   | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |
| `security`                                                                                                                                                       | [tarik.LK.models.operations.StatusValidatedApiV1OrdersOrderIdStatusPostSecurity](../../models/operations/StatusValidatedApiV1OrdersOrderIdStatusPostSecurity.md) | :heavy_check_mark:                                                                                                                                               | The security requirements to use for the request.                                                                                                                |


### Response

**[tarik.LK.models.operations.StatusValidatedApiV1OrdersOrderIdStatusPostResponse](../../models/operations/StatusValidatedApiV1OrdersOrderIdStatusPostResponse.md)**

