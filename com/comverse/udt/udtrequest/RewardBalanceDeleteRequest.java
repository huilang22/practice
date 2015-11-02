/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceDeleteRequest.java
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
 * Class used to create a RewardBalanceDeleteRequest Udt Request
 *
 */

public class RewardBalanceDeleteRequest extends RewardBalanceSubRequestParent {
/**
 *
 * Constructor to create a  RewardBalanceDeleteRequest
 * @param id Unique request name
 * @param RBIDeleteIn RewardBalanceObjectKeyData for RewardBalanceDeleteRequest
 *
 */
@JsonCreator
  public RewardBalanceDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RewardBalance")RewardBalanceObjectKeyData RBIDeleteIn) {
    super(id, "RewardBalanceDelete");
    if (RBIDeleteIn != null) {
      addInput("RewardBalance", RewardBalanceObjectKeyHelper.toMap(RBIDeleteIn, new HashMap(), "RewardBalanceObjectKeyData").get("RewardBalanceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RewardBalanceObjectData that results from the RewardBalanceDeleteRequest call
 * @return RewardBalanceObjectData resulting from udt call
 *
 */

  public RewardBalanceObjectData getOutput() {
    return RewardBalanceObjectHelper.fromMap(outputMap, "RewardBalance");
  }
}
