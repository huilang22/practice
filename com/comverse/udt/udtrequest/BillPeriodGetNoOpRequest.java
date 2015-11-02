/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillPeriodGetNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a BillPeriodGetNoOpRequest Udt Request/Response
 *
 */
public class BillPeriodGetNoOpRequest extends BillPeriodSubRequestParent {
/**
 *
 * Constructor to create a   BillPeriodGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillPeriodGetNoOpRequest(String id, BPObjectData noOpIn) {
    super(id, "BillPeriodGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BillPeriod", BPObjectHelper.toMap(noOpIn, new HashMap(), "BillPeriod").get("BillPeriod"));
    }
  }
/**
 *
 * Retrieves the BPObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BPObjectData getOutput() {
    return BPObjectHelper.fromMap(outputMap, "BillPeriod");
  }
}
