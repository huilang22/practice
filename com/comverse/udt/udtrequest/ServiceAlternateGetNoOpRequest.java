/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAlternateGetNoOpRequest.java
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
 * NoOp class used to simulate a ServiceAlternateGetNoOpRequest Udt Request/Response
 *
 */
public class ServiceAlternateGetNoOpRequest extends ServiceSubRequestParent {
/**
 *
 * Constructor to create a   ServiceAlternateGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceAlternateGetNoOpRequest(String id, ServiceObjectBaseData noOpIn) {
    super(id, "ServiceAlternateGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Service", ServiceObjectBaseHelper.toMap(noOpIn, new HashMap(), "Service").get("Service"));
    }
  }
/**
 *
 * Retrieves the ServiceObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceObjectBaseData getOutput() {
    return ServiceObjectBaseHelper.fromMap(outputMap, "Service");
  }
}
