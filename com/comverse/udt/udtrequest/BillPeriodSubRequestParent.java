/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillPeriodSubRequestParent.java
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
 * Abstract base class for all BillPeriod related UdtSubRequestParents
 *
 */
public abstract class BillPeriodSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BillPeriodRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillPeriodRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BillPeriodSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillPeriodSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BillPeriodSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BillPeriodSubRequestParent(String id, String method) {
    super(id, "BillPeriod", method);
  }
}
