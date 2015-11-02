/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderCancelValidateRequest.java
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
 * Class used to create a ServiceOrderCancelValidateRequest Udt Request
 *
 */

public class ServiceOrderCancelValidateRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a  ServiceOrderCancelValidateRequest
 * @param id Unique request name
 * @param ServiceOrderCancelValidateIn ServiceOrderObjectBaseKeyData for ServiceOrderCancelValidateRequest
 *
 */
@JsonCreator
  public ServiceOrderCancelValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseKeyData ServiceOrderCancelValidateIn) {
    super(id, "ServiceOrderCancelValidate");
    if (ServiceOrderCancelValidateIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(ServiceOrderCancelValidateIn, new HashMap(), "ServiceOrderObjectBaseKeyData").get("ServiceOrderObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the ItemObjectDataList that results from the ServiceOrderCancelValidateRequest call
 * @return ItemObjectDataList resulting from udt call
 *
 */

  public ItemObjectDataList getOutput() {
    return ItemObjectHelper.fromMapList(outputMap, "ServiceOrderList");
  }
}
