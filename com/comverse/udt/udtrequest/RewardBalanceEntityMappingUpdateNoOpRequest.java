/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceEntityMappingUpdateNoOpRequest.java
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
 * NoOp class used to simulate a RewardBalanceEntityMappingUpdateNoOpRequest Udt Request/Response
 *
 */
public class RewardBalanceEntityMappingUpdateNoOpRequest extends RewardBalanceEntityMappingSubRequestParent {
/**
 *
 * Constructor to create a   RewardBalanceEntityMappingUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RewardBalanceEntityMappingUpdateNoOpRequest(String id, RewardBalanceEntityMappingObjectData noOpIn) {
    super(id, "RewardBalanceEntityMappingUpdateNoOpRequest");
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
