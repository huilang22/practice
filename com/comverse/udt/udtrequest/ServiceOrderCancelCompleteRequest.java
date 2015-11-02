/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderCancelCompleteRequest.java
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
 * Class used to create a ServiceOrderCancelCompleteRequest Udt Request
 *
 */

public class ServiceOrderCancelCompleteRequest extends ServiceOrderSubRequestParent {
/**
 *
 * Constructor to create a  ServiceOrderCancelCompleteRequest
 * @param id Unique request name
 * @param ServiceOrderCancelCompleteIn ServiceOrderObjectBaseData for ServiceOrderCancelCompleteRequest
 *
 */
@JsonCreator
  public ServiceOrderCancelCompleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseData ServiceOrderCancelCompleteIn) {
    super(id, "ServiceOrderCancelComplete");
    if (ServiceOrderCancelCompleteIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(ServiceOrderCancelCompleteIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderObjectBaseData that results from the ServiceOrderCancelCompleteRequest call
 * @return ServiceOrderObjectBaseData resulting from udt call
 *
 */

  public ServiceOrderObjectBaseData getOutput() {
    return ServiceOrderObjectBaseHelper.fromMap(outputMap, "ServiceOrder");
  }
}
