/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptSubRequestParent.java
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
 * Abstract base class for all BillFmtOpt related UdtSubRequestParents
 *
 */
public abstract class BillFmtOptSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BillFmtOptRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillFmtOptRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BillFmtOptSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillFmtOptSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BillFmtOptSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BillFmtOptSubRequestParent(String id, String method) {
    super(id, "BillFmtOpt", method);
  }
}
