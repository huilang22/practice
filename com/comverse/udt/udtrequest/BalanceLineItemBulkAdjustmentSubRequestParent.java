/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemBulkAdjustmentSubRequestParent.java
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
 * Abstract base class for all BalanceLineItemBulkAdjustment related UdtSubRequestParents
 *
 */
public abstract class BalanceLineItemBulkAdjustmentSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BalanceLineItemBulkAdjustmentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BalanceLineItemBulkAdjustmentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BalanceLineItemBulkAdjustmentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BalanceLineItemBulkAdjustmentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BalanceLineItemBulkAdjustmentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BalanceLineItemBulkAdjustmentSubRequestParent(String id, String method) {
    super(id, "BalanceLineItemBulkAdjustment", method);
  }
}
