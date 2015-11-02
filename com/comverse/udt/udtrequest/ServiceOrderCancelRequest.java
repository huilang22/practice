/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderCancelRequest.java
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
 * Class used to create a ServiceOrderCancelRequest Udt Request
 *
 */

public class ServiceOrderCancelRequest extends ServiceOrderSubRequestParent {
/**
 *
 * Constructor to create a  ServiceOrderCancelRequest
 * @param id Unique request name
 * @param ServiceOrderCancelIn ServiceOrderObjectBaseKeyData for ServiceOrderCancelRequest
 *
 */
@JsonCreator
  public ServiceOrderCancelRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseKeyData ServiceOrderCancelIn) {
    super(id, "ServiceOrderCancel");
    if (ServiceOrderCancelIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(ServiceOrderCancelIn, new HashMap(), "ServiceOrderObjectBaseKeyData").get("ServiceOrderObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderObjectBaseData that results from the ServiceOrderCancelRequest call
 * @return ServiceOrderObjectBaseData resulting from udt call
 *
 */

  public ServiceOrderObjectBaseData getOutput() {
    return ServiceOrderObjectBaseHelper.fromMap(outputMap, "ServiceOrder");
  }
}
