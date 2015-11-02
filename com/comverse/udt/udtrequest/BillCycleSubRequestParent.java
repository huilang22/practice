/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillCycleSubRequestParent.java
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
 * Abstract base class for all BillCycle related UdtSubRequestParents
 *
 */
public abstract class BillCycleSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BillCycleRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillCycleRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BillCycleSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillCycleSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BillCycleSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BillCycleSubRequestParent(String id, String method) {
    super(id, "BillCycle", method);
  }
}
