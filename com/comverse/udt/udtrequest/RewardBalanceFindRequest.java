/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceFindRequest.java
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
 * Class used to create a RewardBalanceFindRequest Udt Request
 *
 */

public class RewardBalanceFindRequest extends RewardBalanceRequest {
/**
 *
 * Constructor to create a  RewardBalanceFindRequest
 * @param id Unique request name
 * @param RBIFindIn RewardBalanceObjectFilter for RewardBalanceFindRequest
 *
 */
@JsonCreator
  public RewardBalanceFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RewardBalance")RewardBalanceObjectFilter RBIFindIn) {
    super(id, "RewardBalanceFind");
    if (RBIFindIn != null) {
      Integer index =  RBIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RewardBalance", RewardBalanceObjectHelper.toMap(RBIFindIn, new HashMap(), "RewardBalance").get("RewardBalance"));
    }
  }

/**
 *
 * Retrieves the RewardBalanceObjectDataList that results from the RewardBalanceFindRequest call
 * @return RewardBalanceObjectDataList resulting from udt call
 *
 */

  public RewardBalanceObjectDataList getOutput() {
    return RewardBalanceObjectHelper.fromMapList(outputMap, "RewardBalanceList");
  }
}
