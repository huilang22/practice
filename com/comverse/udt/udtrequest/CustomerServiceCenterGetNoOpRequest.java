/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerServiceCenterGetNoOpRequest.java
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
 * NoOp class used to simulate a CustomerServiceCenterGetNoOpRequest Udt Request/Response
 *
 */
public class CustomerServiceCenterGetNoOpRequest extends CustomerServiceCenterSubRequestParent {
/**
 *
 * Constructor to create a   CustomerServiceCenterGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerServiceCenterGetNoOpRequest(String id, CustomerServiceCenterObjectData noOpIn) {
    super(id, "CustomerServiceCenterGetNoOpRequest");
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
