/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceEntityMappingDeleteRequest.java
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
 * Class used to create a RewardBalanceEntityMappingDeleteRequest Udt Request
 *
 */

public class RewardBalanceEntityMappingDeleteRequest extends RewardBalanceEntityMappingSubRequestParent {
/**
 *
 * Constructor to create a  RewardBalanceEntityMappingDeleteRequest
 * @param id Unique request name
 * @param RBEMDeleteIn RewardBalanceEntityMappingObjectKeyData for RewardBalanceEntityMappingDeleteRequest
 *
 */
@JsonCreator
  public RewardBalanceEntityMappingDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RewardBalanceEntityMapping")RewardBalanceEntityMappingObjectKeyData RBEMDeleteIn) {
    super(id, "RewardBalanceEntityMappingDelete");
    if (RBEMDeleteIn != null) {
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectKeyHelper.toMap(RBEMDeleteIn, new HashMap(), "RewardBalanceEntityMappingObjectKeyData").get("RewardBalanceEntityMappingObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RewardBalanceEntityMappingObjectData that results from the RewardBalanceEntityMappingDeleteRequest call
 * @return RewardBalanceEntityMappingObjectData resulting from udt call
 *
 */

  public RewardBalanceEntityMappingObjectData getOutput() {
    return RewardBalanceEntityMappingObjectHelper.fromMap(outputMap, "RewardBalanceEntityMapping");
  }
}
