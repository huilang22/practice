/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a ServiceCenterTypeGetNoOpRequest Udt Request/Response
 *
 */
public class ServiceCenterTypeGetNoOpRequest extends ServiceCenterTypeSubRequestParent {
/**
 *
 * Constructor to create a   ServiceCenterTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceCenterTypeGetNoOpRequest(String id, ServiceCenterTypeObjectData noOpIn) {
    super(id, "ServiceCenterTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ServiceCenterType", ServiceCenterTypeObjectHelper.toMap(noOpIn, new HashMap(), "ServiceCenterType").get("ServiceCenterType"));
    }
  }
/**
 *
 * Retrieves the ServiceCenterTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceCenterTypeObjectData getOutput() {
    return ServiceCenterTypeObjectHelper.fromMap(outputMap, "ServiceCenterType");
  }
}
