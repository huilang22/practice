/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositReturnNoOpRequest.java
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
 * NoOp class used to simulate a DepositReturnNoOpRequest Udt Request/Response
 *
 */
public class DepositReturnNoOpRequest extends DepositSubRequestParent {
/**
 *
 * Constructor to create a   DepositReturnNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DepositReturnNoOpRequest(String id, DepositObjectData noOpIn) {
    super(id, "DepositReturnNoOpRequest");
    if (noOpIn != null) {
      addInput("Deposit", DepositObjectHelper.toMap(noOpIn, new HashMap(), "Deposit").get("Deposit"));
    }
  }
/**
 *
 * Retrieves the DepositObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public DepositObjectData getOutput() {
    return DepositObjectHelper.fromMap(outputMap, "Deposit");
  }
}
