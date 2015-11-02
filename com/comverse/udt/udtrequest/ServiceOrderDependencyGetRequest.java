/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderDependencyGetRequest.java
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
 * Class used to create a ServiceOrderDependencyGetRequest Udt Request
 *
 */

public class ServiceOrderDependencyGetRequest extends ServiceOrderDependencySubRequestParent {
/**
 *
 * Constructor to create a  ServiceOrderDependencyGetRequest
 * @param id Unique request name
 * @param ServiceOrderDependencyGetIn ServiceOrderDependencyObjectKeyData for ServiceOrderDependencyGetRequest
 *
 */
@JsonCreator
  public ServiceOrderDependencyGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrderDependency")ServiceOrderDependencyObjectKeyData ServiceOrderDependencyGetIn) {
    super(id, "ServiceOrderDependencyGet");
    if (ServiceOrderDependencyGetIn != null) {
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectKeyHelper.toMap(ServiceOrderDependencyGetIn, new HashMap(), "ServiceOrderDependencyObjectKeyData").get("ServiceOrderDependencyObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderDependencyObjectData that results from the ServiceOrderDependencyGetRequest call
 * @return ServiceOrderDependencyObjectData resulting from udt call
 *
 */

  public ServiceOrderDependencyObjectData getOutput() {
    return ServiceOrderDependencyObjectHelper.fromMap(outputMap, "ServiceOrderDependency");
  }
}
