/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceSubRequestParent.java
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
 * Abstract base class for all RewardBalance related UdtSubRequestParents
 *
 */
public abstract class RewardBalanceSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RewardBalanceRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RewardBalanceRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RewardBalanceSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RewardBalanceSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RewardBalanceSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RewardBalanceSubRequestParent(String id, String method) {
    super(id, "RewardBalance", method);
  }
}
