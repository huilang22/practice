/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemBulkAdjustmentGetNoOpRequest.java
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

import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a BalanceLineItemBulkAdjustmentGetNoOpRequest Udt Request/Response
 *
 */
public class BalanceLineItemBulkAdjustmentGetNoOpRequest extends BalanceLineItemBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a   BalanceLineItemBulkAdjustmentGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BalanceLineItemBulkAdjustmentGetNoOpRequest(String id, BalanceLineItemBulkAdjustmentGetOutputData noOpIn) {
    super(id, "BalanceLineItemBulkAdjustmentGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BalanceLineItemBulkAdjustmentGetOutputData", BalanceLineItemBulkAdjustmentGetOutputHelper.toMap(noOpIn).get("BalanceLineItemBulkAdjustmentGetOutputData"));
    }
  }
/**
 *
 * Retrieves the BalanceLineItemBulkAdjustmentGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public BalanceLineItemBulkAdjustmentGetOutputData getOutput() {
    return BalanceLineItemBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
}
