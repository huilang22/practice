/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceZoneUpdateNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ServiceZoneUpdateNoOpRequest Udt Request/Response
 *
 */
public class ServiceZoneUpdateNoOpRequest extends ServiceZoneSubRequestParent {
/**
 *
 * Constructor to create a   ServiceZoneUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceZoneUpdateNoOpRequest(String id, ServiceZoneObjectData noOpIn) {
    super(id, "ServiceZoneUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ServiceZone", ServiceZoneObjectHelper.toMap(noOpIn, new HashMap(), "ServiceZone").get("ServiceZone"));
    }
  }
/**
 *
 * Retrieves the ServiceZoneObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceZoneObjectData getOutput() {
    return ServiceZoneObjectHelper.fromMap(outputMap, "ServiceZone");
  }
}
