/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderDependencyEvalNoOpRequest.java
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
 * NoOp class used to simulate a ServiceOrderDependencyEvalNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderDependencyEvalNoOpRequest extends ServiceOrderDependencySubRequestParent {
/**
 *
 * Constructor to create a   ServiceOrderDependencyEvalNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderDependencyEvalNoOpRequest(String id, ServiceOrderDependencyObjectData noOpIn) {
    super(id, "ServiceOrderDependencyEvalNoOpRequest");
    if (noOpIn != null) {
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectHelper.toMap(noOpIn, new HashMap(), "ServiceOrderDependency").get("ServiceOrderDependency"));
    }
  }
/**
 *
 * Retrieves the ServiceOrderDependencyObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderDependencyObjectData getOutput() {
    return ServiceOrderDependencyObjectHelper.fromMap(outputMap, "ServiceOrderDependency");
  }
}
