/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfRewardBalanceDetailSubRequestParent.java
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
 * Abstract base class for all CmfRewardBalanceDetail related UdtSubRequestParents
 *
 */
public abstract class CmfRewardBalanceDetailSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CmfRewardBalanceDetailRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CmfRewardBalanceDetailRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CmfRewardBalanceDetailSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CmfRewardBalanceDetailSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CmfRewardBalanceDetailSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CmfRewardBalanceDetailSubRequestParent(String id, String method) {
    super(id, "CmfRewardBalanceDetail", method);
  }
}
