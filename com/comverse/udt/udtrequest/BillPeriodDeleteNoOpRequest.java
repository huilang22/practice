/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillPeriodDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BillPeriodDeleteNoOpRequest Udt Request/Response
 *
 */
public class BillPeriodDeleteNoOpRequest extends BillPeriodSubRequestParent {
/**
 *
 * Constructor to create a   BillPeriodDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillPeriodDeleteNoOpRequest(String id, BPObjectData noOpIn) {
    super(id, "BillPeriodDeleteNoOpRequest");
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
