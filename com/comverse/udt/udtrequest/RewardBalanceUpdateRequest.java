/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceUpdateRequest.java
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
 * Class used to create a RewardBalanceUpdateRequest Udt Request
 *
 */

public class RewardBalanceUpdateRequest extends RewardBalanceSubRequestParent {
/**
 *
 * Constructor to create a  RewardBalanceUpdateRequest
 * @param id Unique request name
 * @param RBIUpdateIn RewardBalanceObjectData for RewardBalanceUpdateRequest
 *
 */
@JsonCreator
  public RewardBalanceUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RewardBalance")RewardBalanceObjectData RBIUpdateIn) {
    super(id, "RewardBalanceUpdate");
    if (RBIUpdateIn != null) {
      addInput("RewardBalance", RewardBalanceObjectHelper.toMap(RBIUpdateIn, new HashMap(), "RewardBalance").get("RewardBalance"));
    }
  }

/**
 *
 * Retrieves the RewardBalanceObjectData that results from the RewardBalanceUpdateRequest call
 * @return RewardBalanceObjectData resulting from udt call
 *
 */

  public RewardBalanceObjectData getOutput() {
    return RewardBalanceObjectHelper.fromMap(outputMap, "RewardBalance");
  }
}
