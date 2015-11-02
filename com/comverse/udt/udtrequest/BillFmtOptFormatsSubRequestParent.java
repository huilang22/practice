/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptFormatsSubRequestParent.java
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
 * Abstract base class for all BillFmtOptFormats related UdtSubRequestParents
 *
 */
public abstract class BillFmtOptFormatsSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BillFmtOptFormatsRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillFmtOptFormatsRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BillFmtOptFormatsSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillFmtOptFormatsSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BillFmtOptFormatsSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BillFmtOptFormatsSubRequestParent(String id, String method) {
    super(id, "BillFmtOptFormats", method);
  }
}
