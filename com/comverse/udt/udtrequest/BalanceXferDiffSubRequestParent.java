/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceXferDiffSubRequestParent.java
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
 * Abstract base class for all BalanceXferDiff related UdtSubRequestParents
 *
 */
public abstract class BalanceXferDiffSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BalanceXferDiffRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BalanceXferDiffRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BalanceXferDiffSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BalanceXferDiffSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BalanceXferDiffSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BalanceXferDiffSubRequestParent(String id, String method) {
    super(id, "BalanceXferDiff", method);
  }
}
