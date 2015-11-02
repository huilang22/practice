/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderCancelNoOpRequest.java
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
 * NoOp class used to simulate a ServiceOrderCancelNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderCancelNoOpRequest extends ServiceOrderSubRequestParent {
/**
 *
 * Constructor to create a   ServiceOrderCancelNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderCancelNoOpRequest(String id, ServiceOrderObjectBaseData noOpIn) {
    super(id, "ServiceOrderCancelNoOpRequest");
    if (noOpIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(noOpIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
/**
 *
 * Retrieves the ServiceOrderObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderObjectBaseData getOutput() {
    return ServiceOrderObjectBaseHelper.fromMap(outputMap, "ServiceOrder");
  }
}
