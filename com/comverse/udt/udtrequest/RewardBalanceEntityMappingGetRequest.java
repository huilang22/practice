/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceEntityMappingGetRequest.java
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
 * Class used to create a RewardBalanceEntityMappingGetRequest Udt Request
 *
 */

public class RewardBalanceEntityMappingGetRequest extends RewardBalanceEntityMappingSubRequestParent {
/**
 *
 * Constructor to create a  RewardBalanceEntityMappingGetRequest
 * @param id Unique request name
 * @param RBEMGetIn RewardBalanceEntityMappingObjectKeyData for RewardBalanceEntityMappingGetRequest
 *
 */
@JsonCreator
  public RewardBalanceEntityMappingGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RewardBalanceEntityMapping")RewardBalanceEntityMappingObjectKeyData RBEMGetIn) {
    super(id, "RewardBalanceEntityMappingGet");
    if (RBEMGetIn != null) {
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectKeyHelper.toMap(RBEMGetIn, new HashMap(), "RewardBalanceEntityMappingObjectKeyData").get("RewardBalanceEntityMappingObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RewardBalanceEntityMappingObjectData that results from the RewardBalanceEntityMappingGetRequest call
 * @return RewardBalanceEntityMappingObjectData resulting from udt call
 *
 */

  public RewardBalanceEntityMappingObjectData getOutput() {
    return RewardBalanceEntityMappingObjectHelper.fromMap(outputMap, "RewardBalanceEntityMapping");
  }
}
