/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailBulkAdjustmentSubRequestParent.java
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
 * Abstract base class for all InvoiceDetailBulkAdjustment related UdtSubRequestParents
 *
 */
public abstract class InvoiceDetailBulkAdjustmentSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvoiceDetailBulkAdjustmentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvoiceDetailBulkAdjustmentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvoiceDetailBulkAdjustmentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvoiceDetailBulkAdjustmentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvoiceDetailBulkAdjustmentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvoiceDetailBulkAdjustmentSubRequestParent(String id, String method) {
    super(id, "InvoiceDetailBulkAdjustment", method);
  }
}
