/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillingFrequencyDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BillingFrequencyDeleteNoOpRequest Udt Request/Response
 *
 */
public class BillingFrequencyDeleteNoOpRequest extends BillingFrequencySubRequestParent {
/**
 *
 * Constructor to create a   BillingFrequencyDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillingFrequencyDeleteNoOpRequest(String id, BFObjectData noOpIn) {
    super(id, "BillingFrequencyDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("BillingFrequency", BFObjectHelper.toMap(noOpIn, new HashMap(), "BillingFrequency").get("BillingFrequency"));
    }
  }
/**
 *
 * Retrieves the BFObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BFObjectData getOutput() {
    return BFObjectHelper.fromMap(outputMap, "BillingFrequency");
  }
}
