/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillRequestHotNoOpRequest.java
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
 * NoOp class used to simulate a InterimBillRequestHotNoOpRequest Udt Request/Response
 *
 */
public class InterimBillRequestHotNoOpRequest extends InterimBillSubRequestParent {
/**
 *
 * Constructor to create a   InterimBillRequestHotNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InterimBillRequestHotNoOpRequest(String id, InterimBillObjectData noOpIn) {
    super(id, "InterimBillRequestHotNoOpRequest");
    if (noOpIn != null) {
      addInput("InterimBill", InterimBillObjectHelper.toMap(noOpIn, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }
/**
 *
 * Retrieves the InterimBillObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InterimBillObjectData getOutput() {
    return InterimBillObjectHelper.fromMap(outputMap, "InterimBill");
  }
}
