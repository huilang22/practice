/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageBulkAdjustmentSubRequestParent.java
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
 * Abstract base class for all UnbilledUsageBulkAdjustment related UdtSubRequestParents
 *
 */
public abstract class UnbilledUsageBulkAdjustmentSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on UnbilledUsageBulkAdjustmentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UnbilledUsageBulkAdjustmentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UnbilledUsageBulkAdjustmentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UnbilledUsageBulkAdjustmentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for UnbilledUsageBulkAdjustmentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UnbilledUsageBulkAdjustmentSubRequestParent(String id, String method) {
    super(id, "UnbilledUsageBulkAdjustment", method);
  }
}
