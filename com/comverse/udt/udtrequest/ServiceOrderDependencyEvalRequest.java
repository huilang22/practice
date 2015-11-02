/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderDependencyEvalRequest.java
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
 * Class used to create a ServiceOrderDependencyEvalRequest Udt Request
 *
 */

public class ServiceOrderDependencyEvalRequest extends ServiceOrderDependencySubRequestParent {
/**
 *
 * Constructor to create a  ServiceOrderDependencyEvalRequest
 * @param id Unique request name
 * @param ServiceOrderDependencyEvalIn ServiceOrderDependencyObjectKeyData for ServiceOrderDependencyEvalRequest
 *
 */
@JsonCreator
  public ServiceOrderDependencyEvalRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrderDependency")ServiceOrderDependencyObjectKeyData ServiceOrderDependencyEvalIn) {
    super(id, "ServiceOrderDependencyEval");
    if (ServiceOrderDependencyEvalIn != null) {
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectKeyHelper.toMap(ServiceOrderDependencyEvalIn, new HashMap(), "ServiceOrderDependencyObjectKeyData").get("ServiceOrderDependencyObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderDependencyObjectData that results from the ServiceOrderDependencyEvalRequest call
 * @return ServiceOrderDependencyObjectData resulting from udt call
 *
 */

  public ServiceOrderDependencyObjectData getOutput() {
    return ServiceOrderDependencyObjectHelper.fromMap(outputMap, "ServiceOrderDependency");
  }
}
