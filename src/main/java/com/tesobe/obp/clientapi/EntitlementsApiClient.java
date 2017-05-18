package com.tesobe.obp.clientapi;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="entitlement", url="${obp.api.rootUrl}")
public interface EntitlementsApiClient {

    @RequestMapping(method = RequestMethod.GET, value = "users/{userId}/entitlements")
    String getEntitlements(@PathVariable("userId") String userId);
}
