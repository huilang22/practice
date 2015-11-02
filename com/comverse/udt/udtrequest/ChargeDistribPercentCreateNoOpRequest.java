/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDistribPercentCreateNoOpRequest.java
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
 * NoOp class used to simulate a ChargeDistribPercentCreateNoOpRequest Udt Request/Response
 *
 */
public class ChargeDistribPercentCreateNoOpRequest extends ChargeDistribPercentSubRequestParent {
/**
 *
 * Constructor to create a   ChargeDistribPercentCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ChargeDistribPercentCreateNoOpRequest(String id, ChargeDistribPercentObjectData noOpIn) {
    super(id, "ChargeDistribPercentCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectHelper.toMap(noOpIn, new HashMap(), "ChargeDistribPercent").get("ChargeDistribPercent"));
    }
  }
/**
 *
 * Retrieves the ChargeDistribPercentObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ChargeDistribPercentObjectData getOutput() {
    return ChargeDistribPercentObjectHelper.fromMap(outputMap, "ChargeDistribPercent");
  }
}
