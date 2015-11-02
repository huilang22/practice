/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceEntityMappingUpdateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a RewardBalanceEntityMappingUpdateRequest Udt Request
 *
 */

public class RewardBalanceEntityMappingUpdateRequest extends RewardBalanceEntityMappingSubRequestParent {
/**
 *
 * Constructor to create a  RewardBalanceEntityMappingUpdateRequest
 * @param id Unique request name
 * @param RBEMUpdateIn RewardBalanceEntityMappingObjectData for RewardBalanceEntityMappingUpdateRequest
 *
 */
@JsonCreator
  public RewardBalanceEntityMappingUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RewardBalanceEntityMapping")RewardBalanceEntityMappingObjectData RBEMUpdateIn) {
    super(id, "RewardBalanceEntityMappingUpdate");
    if (RBEMUpdateIn != null) {
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectHelper.toMap(RBEMUpdateIn, new HashMap(), "RewardBalanceEntityMapping").get("RewardBalanceEntityMapping"));
    }
  }

/**
 *
 * Retrieves the RewardBalanceEntityMappingObjectData that results from the RewardBalanceEntityMappingUpdateRequest call
 * @return RewardBalanceEntityMappingObjectData resulting from udt call
 *
 */

  public RewardBalanceEntityMappingObjectData getOutput() {
    return RewardBalanceEntityMappingObjectHelper.fromMap(outputMap, "RewardBalanceEntityMapping");
  }
}
