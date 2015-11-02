/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceXferDiffCreateNoOpRequest.java
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
 * NoOp class used to simulate a BalanceXferDiffCreateNoOpRequest Udt Request/Response
 *
 */
public class BalanceXferDiffCreateNoOpRequest extends BalanceXferDiffSubRequestParent {
/**
 *
 * Constructor to create a   BalanceXferDiffCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BalanceXferDiffCreateNoOpRequest(String id, BXDObjectData noOpIn) {
    super(id, "BalanceXferDiffCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("BalanceXferDiff", BXDObjectHelper.toMap(noOpIn, new HashMap(), "BalanceXferDiff").get("BalanceXferDiff"));
    }
  }
/**
 *
 * Retrieves the BXDObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BXDObjectData getOutput() {
    return BXDObjectHelper.fromMap(outputMap, "BalanceXferDiff");
  }
}
