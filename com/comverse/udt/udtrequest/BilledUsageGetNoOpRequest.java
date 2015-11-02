/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageGetNoOpRequest.java
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
 * NoOp class used to simulate a BilledUsageGetNoOpRequest Udt Request/Response
 *
 */
public class BilledUsageGetNoOpRequest extends BilledUsageSubRequestParent {
/**
 *
 * Constructor to create a   BilledUsageGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BilledUsageGetNoOpRequest(String id, BilledUsageObjectData noOpIn) {
    super(id, "BilledUsageGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(noOpIn, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
/**
 *
 * Retrieves the BilledUsageObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BilledUsageObjectData getOutput() {
    return BilledUsageObjectHelper.fromMap(outputMap, "BilledUsage");
  }
}
