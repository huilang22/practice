/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceZoneCreateNoOpRequest.java
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
 * NoOp class used to simulate a ServiceZoneCreateNoOpRequest Udt Request/Response
 *
 */
public class ServiceZoneCreateNoOpRequest extends ServiceZoneSubRequestParent {
/**
 *
 * Constructor to create a   ServiceZoneCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceZoneCreateNoOpRequest(String id, ServiceZoneObjectData noOpIn) {
    super(id, "ServiceZoneCreateNoOpRequest");
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
