/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceEntityMappingSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RewardBalanceEntityMapping related UdtSubRequestParents
 *
 */
public abstract class RewardBalanceEntityMappingSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RewardBalanceEntityMappingRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RewardBalanceEntityMappingRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RewardBalanceEntityMappingSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RewardBalanceEntityMappingSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RewardBalanceEntityMappingSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RewardBalanceEntityMappingSubRequestParent(String id, String method) {
    super(id, "RewardBalanceEntityMapping", method);
  }
}
