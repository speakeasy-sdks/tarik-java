# authentication

### Available Operations

* [loginApiV1TokenPost](#loginapiv1tokenpost) - Login

## loginApiV1TokenPost

Login

### Example Usage

```java
package hello.world;

import tarik.LK.Lk;
import tarik.LK.models.operations.LoginApiV1TokenPostResponse;
import tarik.LK.models.shared.BodyLoginApiV1TokenPost;

public class Application {
    public static void main(String[] args) {
        try {
            Lk sdk = Lk.builder()
                .build();

            tarik.LK.models.shared.BodyLoginApiV1TokenPost req = new BodyLoginApiV1TokenPost("corrupti", "illum") {{
                clientId = "vel";
                clientSecret = "error";
                grantType = "deserunt";
                scope = "suscipit";
            }};            

            LoginApiV1TokenPostResponse res = sdk.authentication.loginApiV1TokenPost(req);

            if (res.loginApiV1TokenPost200ApplicationJSONAny != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
