/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerServiceCenterCreateNoOpRequest.java
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
 * NoOp class used to simulate a CustomerServiceCenterCreateNoOpRequest Udt Request/Response
 *
 */
public class CustomerServiceCenterCreateNoOpRequest extends CustomerServiceCenterSubRequestParent {
/**
 *
 * Constructor to create a   CustomerServiceCenterCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerServiceCenterCreateNoOpRequest(String id, CustomerServiceCenterObjectData noOpIn) {
    super(id, "CustomerServiceCenterCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectHelper.toMap(noOpIn, new HashMap(), "CustomerServiceCenter").get("CustomerServiceCenter"));
    }
  }
/**
 *
 * Retrieves the CustomerServiceCenterObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerServiceCenterObjectData getOutput() {
    return CustomerServiceCenterObjectHelper.fromMap(outputMap, "CustomerServiceCenter");
  }
}
