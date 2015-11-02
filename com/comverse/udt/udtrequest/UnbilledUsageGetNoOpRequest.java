/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageGetNoOpRequest.java
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
 * NoOp class used to simulate a UnbilledUsageGetNoOpRequest Udt Request/Response
 *
 */
public class UnbilledUsageGetNoOpRequest extends UnbilledUsageSubRequestParent {
/**
 *
 * Constructor to create a   UnbilledUsageGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnbilledUsageGetNoOpRequest(String id, UnbilledUsageObjectData noOpIn) {
    super(id, "UnbilledUsageGetNoOpRequest");
    if (noOpIn != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(noOpIn, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
/**
 *
 * Retrieves the UnbilledUsageObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UnbilledUsageObjectData getOutput() {
    return UnbilledUsageObjectHelper.fromMap(outputMap, "UnbilledUsage");
  }
}
