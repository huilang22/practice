/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ReverseBulkAdjustmentSubRequestParent.java
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
 * Abstract base class for all ReverseBulkAdjustment related UdtSubRequestParents
 *
 */
public abstract class ReverseBulkAdjustmentSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ReverseBulkAdjustmentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ReverseBulkAdjustmentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ReverseBulkAdjustmentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ReverseBulkAdjustmentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ReverseBulkAdjustmentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ReverseBulkAdjustmentSubRequestParent(String id, String method) {
    super(id, "ReverseBulkAdjustment", method);
  }
}
