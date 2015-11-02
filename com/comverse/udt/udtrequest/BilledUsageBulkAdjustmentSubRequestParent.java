/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageBulkAdjustmentSubRequestParent.java
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
 * Abstract base class for all BilledUsageBulkAdjustment related UdtSubRequestParents
 *
 */
public abstract class BilledUsageBulkAdjustmentSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BilledUsageBulkAdjustmentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BilledUsageBulkAdjustmentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BilledUsageBulkAdjustmentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BilledUsageBulkAdjustmentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BilledUsageBulkAdjustmentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BilledUsageBulkAdjustmentSubRequestParent(String id, String method) {
    super(id, "BilledUsageBulkAdjustment", method);
  }
}
