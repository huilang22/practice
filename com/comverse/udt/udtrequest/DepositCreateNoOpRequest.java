/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositCreateNoOpRequest.java
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
 * NoOp class used to simulate a DepositCreateNoOpRequest Udt Request/Response
 *
 */
public class DepositCreateNoOpRequest extends DepositSubRequestParent {
/**
 *
 * Constructor to create a   DepositCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DepositCreateNoOpRequest(String id, DepositObjectData noOpIn) {
    super(id, "DepositCreateNoOpRequest");
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
