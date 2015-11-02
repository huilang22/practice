/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositGetNoOpRequest.java
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
 * NoOp class used to simulate a DepositGetNoOpRequest Udt Request/Response
 *
 */
public class DepositGetNoOpRequest extends DepositSubRequestParent {
/**
 *
 * Constructor to create a   DepositGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DepositGetNoOpRequest(String id, DepositObjectData noOpIn) {
    super(id, "DepositGetNoOpRequest");
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
