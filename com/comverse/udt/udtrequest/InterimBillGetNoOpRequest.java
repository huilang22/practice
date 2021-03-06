/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillGetNoOpRequest.java
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
 * NoOp class used to simulate a InterimBillGetNoOpRequest Udt Request/Response
 *
 */
public class InterimBillGetNoOpRequest extends InterimBillSubRequestParent {
/**
 *
 * Constructor to create a   InterimBillGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InterimBillGetNoOpRequest(String id, InterimBillObjectData noOpIn) {
    super(id, "InterimBillGetNoOpRequest");
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
