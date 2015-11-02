/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderCreateNoOpRequest.java
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
 * NoOp class used to simulate a ServiceOrderCreateNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderCreateNoOpRequest extends ServiceOrderSubRequestParent {
/**
 *
 * Constructor to create a   ServiceOrderCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderCreateNoOpRequest(String id, ServiceOrderObjectBaseData noOpIn) {
    super(id, "ServiceOrderCreateNoOpRequest");
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
