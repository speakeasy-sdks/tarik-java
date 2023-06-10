# orderTicket

### Available Operations

* [newTicketApiV1TicketPost](#newticketapiv1ticketpost) - Add new order ticket
* [ticketStatusApiV1TicketTicketIdCommentPost](#ticketstatusapiv1ticketticketidcommentpost) - Add ticket comment

## newTicketApiV1TicketPost

Add new order ticket

### Example Usage

```java
package hello.world;

import java.time.OffsetDateTime;
import tarik.LK.Lk;
import tarik.LK.models.operations.NewTicketApiV1TicketPostResponse;
import tarik.LK.models.operations.NewTicketApiV1TicketPostSecurity;
import tarik.LK.models.shared.OrderTicket;
import tarik.LK.models.shared.OrderTicketStatus;

public class Application {
    public static void main(String[] args) {
        try {
            Lk sdk = Lk.builder()
                .build();

            tarik.LK.models.shared.OrderTicket req = new OrderTicket("delectus", 433288L, OffsetDateTime.parse("2022-03-31T00:30:19.135Z"), OrderTicketStatus.AE7F411E_F46B1410009B0050BA5D6C38, "aliquid");            

            NewTicketApiV1TicketPostResponse res = sdk.orderTicket.newTicketApiV1TicketPost(req, new NewTicketApiV1TicketPostSecurity("provident") {{
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [tarik.LK.models.shared.OrderTicket](../../models/shared/OrderTicket.md)                                                   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [tarik.LK.models.operations.NewTicketApiV1TicketPostSecurity](../../models/operations/NewTicketApiV1TicketPostSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[tarik.LK.models.operations.NewTicketApiV1TicketPostResponse](../../models/operations/NewTicketApiV1TicketPostResponse.md)**


## ticketStatusApiV1TicketTicketIdCommentPost

Add ticket comment

### Example Usage

```java
package hello.world;

import java.time.OffsetDateTime;
import tarik.LK.Lk;
import tarik.LK.models.operations.TicketStatusApiV1TicketTicketIdCommentPostRequest;
import tarik.LK.models.operations.TicketStatusApiV1TicketTicketIdCommentPostResponse;
import tarik.LK.models.operations.TicketStatusApiV1TicketTicketIdCommentPostSecurity;
import tarik.LK.models.shared.OrderTicket;
import tarik.LK.models.shared.OrderTicketStatus;

public class Application {
    public static void main(String[] args) {
        try {
            Lk sdk = Lk.builder()
                .build();

            TicketStatusApiV1TicketTicketIdCommentPostRequest req = new TicketStatusApiV1TicketTicketIdCommentPostRequest(                new OrderTicket("necessitatibus", 572252L, OffsetDateTime.parse("2022-07-22T03:36:34.615Z"), OrderTicketStatus.SIXE5F4218_F46B1410_FE9A0050BA5D6C38, "a");, "dolorum");            

            TicketStatusApiV1TicketTicketIdCommentPostResponse res = sdk.orderTicket.ticketStatusApiV1TicketTicketIdCommentPost(req, new TicketStatusApiV1TicketTicketIdCommentPostSecurity("in") {{
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

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [tarik.LK.models.operations.TicketStatusApiV1TicketTicketIdCommentPostRequest](../../models/operations/TicketStatusApiV1TicketTicketIdCommentPostRequest.md)   | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |
| `security`                                                                                                                                                     | [tarik.LK.models.operations.TicketStatusApiV1TicketTicketIdCommentPostSecurity](../../models/operations/TicketStatusApiV1TicketTicketIdCommentPostSecurity.md) | :heavy_check_mark:                                                                                                                                             | The security requirements to use for the request.                                                                                                              |


### Response

**[tarik.LK.models.operations.TicketStatusApiV1TicketTicketIdCommentPostResponse](../../models/operations/TicketStatusApiV1TicketTicketIdCommentPostResponse.md)**

