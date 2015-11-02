/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderDependencyCreateRequest.java
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
 * Class used to create a ServiceOrderDependencyCreateRequest Udt Request
 *
 */

public class ServiceOrderDependencyCreateRequest extends ServiceOrderDependencySubRequestParent {
/**
 *
 * Constructor to create a  ServiceOrderDependencyCreateRequest
 * @param id Unique request name
 * @param ServiceOrderDependencyCreateIn ServiceOrderDependencyObjectData for ServiceOrderDependencyCreateRequest
 *
 */
@JsonCreator
  public ServiceOrderDependencyCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrderDependency")ServiceOrderDependencyObjectData ServiceOrderDependencyCreateIn) {
    super(id, "ServiceOrderDependencyCreate");
    if (ServiceOrderDependencyCreateIn != null) {
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectHelper.toMap(ServiceOrderDependencyCreateIn, new HashMap(), "ServiceOrderDependency").get("ServiceOrderDependency"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderDependencyObjectData that results from the ServiceOrderDependencyCreateRequest call
 * @return ServiceOrderDependencyObjectData resulting from udt call
 *
 */

  public ServiceOrderDependencyObjectData getOutput() {
    return ServiceOrderDependencyObjectHelper.fromMap(outputMap, "ServiceOrderDependency");
  }
}
