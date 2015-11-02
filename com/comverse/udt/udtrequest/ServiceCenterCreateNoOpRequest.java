/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterCreateNoOpRequest.java
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
 * NoOp class used to simulate a ServiceCenterCreateNoOpRequest Udt Request/Response
 *
 */
public class ServiceCenterCreateNoOpRequest extends ServiceCenterSubRequestParent {
/**
 *
 * Constructor to create a   ServiceCenterCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceCenterCreateNoOpRequest(String id, ServiceCenterObjectData noOpIn) {
    super(id, "ServiceCenterCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ServiceCenter", ServiceCenterObjectHelper.toMap(noOpIn, new HashMap(), "ServiceCenter").get("ServiceCenter"));
    }
  }
/**
 *
 * Retrieves the ServiceCenterObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceCenterObjectData getOutput() {
    return ServiceCenterObjectHelper.fromMap(outputMap, "ServiceCenter");
  }
}
