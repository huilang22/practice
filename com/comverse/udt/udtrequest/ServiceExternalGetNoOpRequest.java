/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceExternalGetNoOpRequest.java
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
 * NoOp class used to simulate a ServiceExternalGetNoOpRequest Udt Request/Response
 *
 */
public class ServiceExternalGetNoOpRequest extends ServiceSubRequestParent {
/**
 *
 * Constructor to create a   ServiceExternalGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceExternalGetNoOpRequest(String id, ServiceObjectData noOpIn) {
    super(id, "ServiceExternalGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Service", ServiceObjectHelper.toMap(noOpIn, new HashMap(), "Service").get("Service"));
    }
  }
/**
 *
 * Retrieves the ServiceObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceObjectData getOutput() {
    return ServiceObjectHelper.fromMap(outputMap, "Service");
  }
}
