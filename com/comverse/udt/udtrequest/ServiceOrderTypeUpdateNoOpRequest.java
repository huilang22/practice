/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderTypeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ServiceOrderTypeUpdateNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderTypeUpdateNoOpRequest extends ServiceOrderTypeSubRequestParent {
/**
 *
 * Constructor to create a   ServiceOrderTypeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderTypeUpdateNoOpRequest(String id, ServiceOrderTypeObjectData noOpIn) {
    super(id, "ServiceOrderTypeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ServiceOrderType", ServiceOrderTypeObjectHelper.toMap(noOpIn, new HashMap(), "ServiceOrderType").get("ServiceOrderType"));
    }
  }
/**
 *
 * Retrieves the ServiceOrderTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderTypeObjectData getOutput() {
    return ServiceOrderTypeObjectHelper.fromMap(outputMap, "ServiceOrderType");
  }
}
