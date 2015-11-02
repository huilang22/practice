/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceGetRequest.java
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
 * Class used to create a RewardBalanceGetRequest Udt Request
 *
 */

public class RewardBalanceGetRequest extends RewardBalanceSubRequestParent {
/**
 *
 * Constructor to create a  RewardBalanceGetRequest
 * @param id Unique request name
 * @param RBIGetIn RewardBalanceObjectKeyData for RewardBalanceGetRequest
 *
 */
@JsonCreator
  public RewardBalanceGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RewardBalance")RewardBalanceObjectKeyData RBIGetIn) {
    super(id, "RewardBalanceGet");
    if (RBIGetIn != null) {
      addInput("RewardBalance", RewardBalanceObjectKeyHelper.toMap(RBIGetIn, new HashMap(), "RewardBalanceObjectKeyData").get("RewardBalanceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RewardBalanceObjectData that results from the RewardBalanceGetRequest call
 * @return RewardBalanceObjectData resulting from udt call
 *
 */

  public RewardBalanceObjectData getOutput() {
    return RewardBalanceObjectHelper.fromMap(outputMap, "RewardBalance");
  }
}
