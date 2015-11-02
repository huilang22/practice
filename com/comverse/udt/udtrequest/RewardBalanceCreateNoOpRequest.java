/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceCreateNoOpRequest.java
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
 * NoOp class used to simulate a RewardBalanceCreateNoOpRequest Udt Request/Response
 *
 */
public class RewardBalanceCreateNoOpRequest extends RewardBalanceSubRequestParent {
/**
 *
 * Constructor to create a   RewardBalanceCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RewardBalanceCreateNoOpRequest(String id, RewardBalanceObjectData noOpIn) {
    super(id, "RewardBalanceCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("RewardBalance", RewardBalanceObjectHelper.toMap(noOpIn, new HashMap(), "RewardBalance").get("RewardBalance"));
    }
  }
/**
 *
 * Retrieves the RewardBalanceObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RewardBalanceObjectData getOutput() {
    return RewardBalanceObjectHelper.fromMap(outputMap, "RewardBalance");
  }
}
