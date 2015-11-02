/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentDistributionGetNoOpRequest.java
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
 * NoOp class used to simulate a PrepaymentDistributionGetNoOpRequest Udt Request/Response
 *
 */
public class PrepaymentDistributionGetNoOpRequest extends PrepaymentDistributionSubRequestParent {
/**
 *
 * Constructor to create a   PrepaymentDistributionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PrepaymentDistributionGetNoOpRequest(String id, PrepaymentDistributionObjectData noOpIn) {
    super(id, "PrepaymentDistributionGetNoOpRequest");
    if (noOpIn != null) {
      addInput("PrepaymentDistribution", PrepaymentDistributionObjectHelper.toMap(noOpIn, new HashMap(), "PrepaymentDistribution").get("PrepaymentDistribution"));
    }
  }
/**
 *
 * Retrieves the PrepaymentDistributionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PrepaymentDistributionObjectData getOutput() {
    return PrepaymentDistributionObjectHelper.fromMap(outputMap, "PrepaymentDistribution");
  }
}
