/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HierarchyRTUnitCreditBalanceQueryNoOpRequest.java
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
 * NoOp class used to simulate a HierarchyRTUnitCreditBalanceQueryNoOpRequest Udt Request/Response
 *
 */
public class HierarchyRTUnitCreditBalanceQueryNoOpRequest extends RTUnitCreditBalanceSubRequestParent {
/**
 *
 * Constructor to create a   HierarchyRTUnitCreditBalanceQueryNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HierarchyRTUnitCreditBalanceQueryNoOpRequest(String id, HierarchyRTUnitCreditBalanceQueryOutputData noOpIn) {
    super(id, "HierarchyRTUnitCreditBalanceQueryNoOpRequest");
    if (noOpIn != null) {
      addInput("HierarchyRTUnitCreditBalanceQueryOutputData", HierarchyRTUnitCreditBalanceQueryOutputHelper.toMap(noOpIn).get("HierarchyRTUnitCreditBalanceQueryOutputData"));
    }
  }
/**
 *
 * Retrieves the HierarchyRTUnitCreditBalanceQueryOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public HierarchyRTUnitCreditBalanceQueryOutputData getOutput() {
    return HierarchyRTUnitCreditBalanceQueryOutputHelper.fromMap(outputMap);
  }
}
