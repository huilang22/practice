/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentGetNoOpRequest.java
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
 * NoOp class used to simulate a PrepaymentGetNoOpRequest Udt Request/Response
 *
 */
public class PrepaymentGetNoOpRequest extends PrepaymentSubRequestParent {
/**
 *
 * Constructor to create a   PrepaymentGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PrepaymentGetNoOpRequest(String id, PrepaymentObjectData noOpIn) {
    super(id, "PrepaymentGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Prepayment", PrepaymentObjectHelper.toMap(noOpIn, new HashMap(), "Prepayment").get("Prepayment"));
    }
  }
/**
 *
 * Retrieves the PrepaymentObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PrepaymentObjectData getOutput() {
    return PrepaymentObjectHelper.fromMap(outputMap, "Prepayment");
  }
}
