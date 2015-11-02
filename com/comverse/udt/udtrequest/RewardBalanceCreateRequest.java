/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceCreateRequest.java
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
 * Class used to create a RewardBalanceCreateRequest Udt Request
 *
 */

public class RewardBalanceCreateRequest extends RewardBalanceSubRequestParent {
/**
 *
 * Constructor to create a  RewardBalanceCreateRequest
 * @param id Unique request name
 * @param RBICreateIn RewardBalanceObjectData for RewardBalanceCreateRequest
 *
 */
@JsonCreator
  public RewardBalanceCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RewardBalance")RewardBalanceObjectData RBICreateIn) {
    super(id, "RewardBalanceCreate");
    if (RBICreateIn != null) {
      addInput("RewardBalance", RewardBalanceObjectHelper.toMap(RBICreateIn, new HashMap(), "RewardBalance").get("RewardBalance"));
    }
  }

/**
 *
 * Retrieves the RewardBalanceObjectData that results from the RewardBalanceCreateRequest call
 * @return RewardBalanceObjectData resulting from udt call
 *
 */

  public RewardBalanceObjectData getOutput() {
    return RewardBalanceObjectHelper.fromMap(outputMap, "RewardBalance");
  }
}
