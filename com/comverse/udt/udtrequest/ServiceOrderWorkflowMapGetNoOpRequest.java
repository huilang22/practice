/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderWorkflowMapGetNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a ServiceOrderWorkflowMapGetNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderWorkflowMapGetNoOpRequest extends ServiceOrderWorkflowMapSubRequestParent {
/**
 *
 * Constructor to create a   ServiceOrderWorkflowMapGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderWorkflowMapGetNoOpRequest(String id, ServiceOrderWorkflowMapObjectData noOpIn) {
    super(id, "ServiceOrderWorkflowMapGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ServiceOrderWorkflowMap", ServiceOrderWorkflowMapObjectHelper.toMap(noOpIn, new HashMap(), "ServiceOrderWorkflowMap").get("ServiceOrderWorkflowMap"));
    }
  }
/**
 *
 * Retrieves the ServiceOrderWorkflowMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderWorkflowMapObjectData getOutput() {
    return ServiceOrderWorkflowMapObjectHelper.fromMap(outputMap, "ServiceOrderWorkflowMap");
  }
}
