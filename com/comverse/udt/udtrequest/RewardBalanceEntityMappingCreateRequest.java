/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceEntityMappingCreateRequest.java
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
 * Class used to create a RewardBalanceEntityMappingCreateRequest Udt Request
 *
 */

public class RewardBalanceEntityMappingCreateRequest extends RewardBalanceEntityMappingSubRequestParent {
/**
 *
 * Constructor to create a  RewardBalanceEntityMappingCreateRequest
 * @param id Unique request name
 * @param RBEMCreateIn RewardBalanceEntityMappingObjectData for RewardBalanceEntityMappingCreateRequest
 *
 */
@JsonCreator
  public RewardBalanceEntityMappingCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RewardBalanceEntityMapping")RewardBalanceEntityMappingObjectData RBEMCreateIn) {
    super(id, "RewardBalanceEntityMappingCreate");
    if (RBEMCreateIn != null) {
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectHelper.toMap(RBEMCreateIn, new HashMap(), "RewardBalanceEntityMapping").get("RewardBalanceEntityMapping"));
    }
  }

/**
 *
 * Retrieves the RewardBalanceEntityMappingObjectData that results from the RewardBalanceEntityMappingCreateRequest call
 * @return RewardBalanceEntityMappingObjectData resulting from udt call
 *
 */

  public RewardBalanceEntityMappingObjectData getOutput() {
    return RewardBalanceEntityMappingObjectHelper.fromMap(outputMap, "RewardBalanceEntityMapping");
  }
}
