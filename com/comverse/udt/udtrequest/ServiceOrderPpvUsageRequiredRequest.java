/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderPpvUsageRequiredRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServiceOrderPpvUsageRequiredRequest Udt Request
 *
 */

public class ServiceOrderPpvUsageRequiredRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a  ServiceOrderPpvUsageRequiredRequest
 * @param id Unique request name
 * @param ppvSOIn ServiceOrderObjectBaseKeyData for ServiceOrderPpvUsageRequiredRequest
 *
 */
@JsonCreator
  public ServiceOrderPpvUsageRequiredRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseKeyData ppvSOIn) {
    super(id, "ServiceOrderPpvUsageRequired");
    if (ppvSOIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(ppvSOIn, new HashMap(), "ServiceOrderObjectBaseKeyData").get("ServiceOrderObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the ServiceOrderPpvUsageRequiredRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("Result");
  }
}
