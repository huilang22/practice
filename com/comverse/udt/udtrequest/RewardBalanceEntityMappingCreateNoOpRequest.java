/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceEntityMappingCreateNoOpRequest.java
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
 * NoOp class used to simulate a RewardBalanceEntityMappingCreateNoOpRequest Udt Request/Response
 *
 */
public class RewardBalanceEntityMappingCreateNoOpRequest extends RewardBalanceEntityMappingSubRequestParent {
/**
 *
 * Constructor to create a   RewardBalanceEntityMappingCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RewardBalanceEntityMappingCreateNoOpRequest(String id, RewardBalanceEntityMappingObjectData noOpIn) {
    super(id, "RewardBalanceEntityMappingCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectHelper.toMap(noOpIn, new HashMap(), "RewardBalanceEntityMapping").get("RewardBalanceEntityMapping"));
    }
  }
/**
 *
 * Retrieves the RewardBalanceEntityMappingObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RewardBalanceEntityMappingObjectData getOutput() {
    return RewardBalanceEntityMappingObjectHelper.fromMap(outputMap, "RewardBalanceEntityMapping");
  }
}
