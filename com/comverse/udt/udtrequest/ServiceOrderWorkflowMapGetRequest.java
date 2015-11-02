/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderWorkflowMapGetRequest.java
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
 * Class used to create a ServiceOrderWorkflowMapGetRequest Udt Request
 *
 */

public class ServiceOrderWorkflowMapGetRequest extends ServiceOrderWorkflowMapSubRequestParent {
/**
 *
 * Constructor to create a  ServiceOrderWorkflowMapGetRequest
 * @param id Unique request name
 * @param ServiceOrderWorkflowMapGetIn ServiceOrderWorkflowMapObjectKeyData for ServiceOrderWorkflowMapGetRequest
 *
 */
@JsonCreator
  public ServiceOrderWorkflowMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrderWorkflowMap")ServiceOrderWorkflowMapObjectKeyData ServiceOrderWorkflowMapGetIn) {
    super(id, "ServiceOrderWorkflowMapGet");
    if (ServiceOrderWorkflowMapGetIn != null) {
      addInput("ServiceOrderWorkflowMap", ServiceOrderWorkflowMapObjectKeyHelper.toMap(ServiceOrderWorkflowMapGetIn, new HashMap(), "ServiceOrderWorkflowMapObjectKeyData").get("ServiceOrderWorkflowMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceOrderWorkflowMapObjectData that results from the ServiceOrderWorkflowMapGetRequest call
 * @return ServiceOrderWorkflowMapObjectData resulting from udt call
 *
 */

  public ServiceOrderWorkflowMapObjectData getOutput() {
    return ServiceOrderWorkflowMapObjectHelper.fromMap(outputMap, "ServiceOrderWorkflowMap");
  }
}
