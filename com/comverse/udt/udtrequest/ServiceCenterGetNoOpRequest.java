/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterGetNoOpRequest.java
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
 * NoOp class used to simulate a ServiceCenterGetNoOpRequest Udt Request/Response
 *
 */
public class ServiceCenterGetNoOpRequest extends ServiceCenterSubRequestParent {
/**
 *
 * Constructor to create a   ServiceCenterGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceCenterGetNoOpRequest(String id, ServiceCenterObjectData noOpIn) {
    super(id, "ServiceCenterGetNoOpRequest");
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
