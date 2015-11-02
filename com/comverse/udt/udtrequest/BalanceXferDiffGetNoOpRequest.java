/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceXferDiffGetNoOpRequest.java
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
 * NoOp class used to simulate a BalanceXferDiffGetNoOpRequest Udt Request/Response
 *
 */
public class BalanceXferDiffGetNoOpRequest extends BalanceXferDiffSubRequestParent {
/**
 *
 * Constructor to create a   BalanceXferDiffGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BalanceXferDiffGetNoOpRequest(String id, BXDObjectData noOpIn) {
    super(id, "BalanceXferDiffGetNoOpRequest");
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
