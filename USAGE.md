<!-- Start SDK Example Usage -->
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

            tarik.LK.models.shared.BodyLoginApiV1TokenPost req = new BodyLoginApiV1TokenPost("corrupti", "provident") {{
                clientId = "distinctio";
                clientSecret = "quibusdam";
                grantType = "unde";
                scope = "nulla";
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
<!-- End SDK Example Usage -->