/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceStatusGetNoOpRequest.java
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
 * NoOp class used to simulate a ServiceStatusGetNoOpRequest Udt Request/Response
 *
 */
public class ServiceStatusGetNoOpRequest extends ServiceStatusSubRequestParent {
/**
 *
 * Constructor to create a   ServiceStatusGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceStatusGetNoOpRequest(String id, ServiceStatusObjectData noOpIn) {
    super(id, "ServiceStatusGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ServiceStatus", ServiceStatusObjectHelper.toMap(noOpIn, new HashMap(), "ServiceStatus").get("ServiceStatus"));
    }
  }
/**
 *
 * Retrieves the ServiceStatusObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceStatusObjectData getOutput() {
    return ServiceStatusObjectHelper.fromMap(outputMap, "ServiceStatus");
  }
}
