/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderTypeUpdateRequest.java
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
 * Class used to create a ServiceOrderTypeUpdateRequest Udt Request
 *
 */

public class ServiceOrderTypeUpdateRequest extends ServiceOrderTypeSubRequestParent {
/**
 *
 * Constructor to create a  ServiceOrderTypeUpdateRequest
 * @param id Unique request name
 * @param ServiceOrderTypeUpdateIn ServiceOrderTypeObjectData for ServiceOrderTypeUpdateRequest
 *
 */
@JsonCreator
  public ServiceOrderTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrderType")ServiceOrderTypeObjectData ServiceOrderTypeUpdateIn) {
    super(id, "ServiceOrderTypeUpdate");
    if (ServiceOrderTypeUpdateIn != null) {
      addInput("ServiceOrderType", ServiceOrderTypeObjectHelper.toMap(ServiceOrderTypeUpdateIn, new HashMap(), "ServiceOrderType").get("ServiceOrderType"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderTypeObjectData that results from the ServiceOrderTypeUpdateRequest call
 * @return ServiceOrderTypeObjectData resulting from udt call
 *
 */

  public ServiceOrderTypeObjectData getOutput() {
    return ServiceOrderTypeObjectHelper.fromMap(outputMap, "ServiceOrderType");
  }
}
