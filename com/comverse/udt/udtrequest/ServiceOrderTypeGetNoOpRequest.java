/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a ServiceOrderTypeGetNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderTypeGetNoOpRequest extends ServiceOrderTypeSubRequestParent {
/**
 *
 * Constructor to create a   ServiceOrderTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderTypeGetNoOpRequest(String id, ServiceOrderTypeObjectData noOpIn) {
    super(id, "ServiceOrderTypeGetNoOpRequest");
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
