/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillCycleGetNoOpRequest.java
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
 * NoOp class used to simulate a BillCycleGetNoOpRequest Udt Request/Response
 *
 */
public class BillCycleGetNoOpRequest extends BillCycleSubRequestParent {
/**
 *
 * Constructor to create a   BillCycleGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillCycleGetNoOpRequest(String id, BillCycleObjectData noOpIn) {
    super(id, "BillCycleGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BillCycle", BillCycleObjectHelper.toMap(noOpIn, new HashMap(), "BillCycle").get("BillCycle"));
    }
  }
/**
 *
 * Retrieves the BillCycleObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BillCycleObjectData getOutput() {
    return BillCycleObjectHelper.fromMap(outputMap, "BillCycle");
  }
}
