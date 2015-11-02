/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceEntityMappingFindRequest.java
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
 * Class used to create a RewardBalanceEntityMappingFindRequest Udt Request
 *
 */

public class RewardBalanceEntityMappingFindRequest extends RewardBalanceEntityMappingRequest {
/**
 *
 * Constructor to create a  RewardBalanceEntityMappingFindRequest
 * @param id Unique request name
 * @param RBEMFindIn RewardBalanceEntityMappingObjectFilter for RewardBalanceEntityMappingFindRequest
 *
 */
@JsonCreator
  public RewardBalanceEntityMappingFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RewardBalanceEntityMapping")RewardBalanceEntityMappingObjectFilter RBEMFindIn) {
    super(id, "RewardBalanceEntityMappingFind");
    if (RBEMFindIn != null) {
      Integer index =  RBEMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectHelper.toMap(RBEMFindIn, new HashMap(), "RewardBalanceEntityMapping").get("RewardBalanceEntityMapping"));
    }
  }

/**
 *
 * Retrieves the RewardBalanceEntityMappingObjectDataList that results from the RewardBalanceEntityMappingFindRequest call
 * @return RewardBalanceEntityMappingObjectDataList resulting from udt call
 *
 */

  public RewardBalanceEntityMappingObjectDataList getOutput() {
    return RewardBalanceEntityMappingObjectHelper.fromMapList(outputMap, "RewardBalanceEntityMappingList");
  }
}
