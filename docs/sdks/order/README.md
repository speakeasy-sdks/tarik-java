# order

### Available Operations

* [orderSchemaApiV1OrdersSchemaGet](#orderschemaapiv1ordersschemaget) - Get JSON schema for order
* [orderValidatedApiV1OrdersPost](#ordervalidatedapiv1orderspost) - Add new order

## orderSchemaApiV1OrdersSchemaGet

Get JSON schema for order

### Example Usage

```java
package hello.world;

import tarik.LK.Lk;
import tarik.LK.models.operations.OrderSchemaApiV1OrdersSchemaGetResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Lk sdk = Lk.builder()
                .build();

            OrderSchemaApiV1OrdersSchemaGetResponse res = sdk.order.orderSchemaApiV1OrdersSchemaGet();

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

**[tarik.LK.models.operations.OrderSchemaApiV1OrdersSchemaGetResponse](../../models/operations/OrderSchemaApiV1OrdersSchemaGetResponse.md)**


## orderValidatedApiV1OrdersPost

Checks if JSON has valid schema and adds request to create new order. No multiple orders will be created for the same **order_id**, even if request is accepted. Only first order request for **order_id** is created.

### Example Usage

```java
package hello.world;

import java.time.OffsetDateTime;
import tarik.LK.Lk;
import tarik.LK.models.operations.OrderValidatedApiV1OrdersPostResponse;
import tarik.LK.models.operations.OrderValidatedApiV1OrdersPostSecurity;
import tarik.LK.models.shared.Customer;
import tarik.LK.models.shared.Item;
import tarik.LK.models.shared.NPPackStation;
import tarik.LK.models.shared.Order;
import tarik.LK.models.shared.Payment;
import tarik.LK.models.shared.PaymentMethod;
import tarik.LK.models.shared.PaymentStatus;
import tarik.LK.models.shared.Recipient;
import tarik.LK.models.shared.Shipping;
import tarik.LK.models.shared.ShippingMethod;
import tarik.LK.models.shared.Street;

public class Application {
    public static void main(String[] args) {
        try {
            Lk sdk = Lk.builder()
                .build();

            tarik.LK.models.shared.Order req = new Order(OffsetDateTime.parse("2022-09-14T09:35:47.986Z"),                 new Customer("debitis", 56713L, "delectus", 272656L, 383441L, "molestiae", "minus", "placeat");,                 new tarik.LK.models.shared.Item[]{{
                                add(new Item("deserunt", 202.18d, 368241L, 832620L) {{
                                    name = "Miriam Huel";
                                    price = 710.36d;
                                    quantity = 337396L;
                                    sku = 87129L;
                                }}),
                                add(new Item("quod", 4614.79d, 520478L, 780529L) {{
                                    name = "Cedric Connelly";
                                    price = 9786.19d;
                                    quantity = 473608L;
                                    sku = 799159L;
                                }}),
                                add(new Item("optio", 5218.48d, 105907L, 414662L) {{
                                    name = "Samuel Reichel";
                                    price = 1433.53d;
                                    quantity = 537373L;
                                    sku = 944669L;
                                }}),
                            }}, 473600L, 264555L,                 new Payment(PaymentMethod.ZERO, PaymentStatus.ZERO);,                 new Shipping(                new NPPackStation("impedit", "b7392059-2939-46fe-a759-6eb10faaa235", "explicabo", "nobis", "5955907a-ff1a-43a2-ba94-67739251aa52", "quo", "3f5ad019-da1f-4fe7-8f09-7b0074f15471",                 new Street("harum");, "5e6e13b9-9d48-48e1-a91e-450ad2abd442", 397821L);, ShippingMethod.NOVAPOSHTA_PACKSTATION,                 new Recipient("cupiditate", "quos", "perferendis", "magni");) {{
                                price = 8289.4d;
                            }};);            

            OrderValidatedApiV1OrdersPostResponse res = sdk.order.orderValidatedApiV1OrdersPost(req, new OrderValidatedApiV1OrdersPostSecurity("ipsam") {{
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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [tarik.LK.models.shared.Order](../../models/shared/Order.md)                                                                         | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [tarik.LK.models.operations.OrderValidatedApiV1OrdersPostSecurity](../../models/operations/OrderValidatedApiV1OrdersPostSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


### Response

**[tarik.LK.models.operations.OrderValidatedApiV1OrdersPostResponse](../../models/operations/OrderValidatedApiV1OrdersPostResponse.md)**

