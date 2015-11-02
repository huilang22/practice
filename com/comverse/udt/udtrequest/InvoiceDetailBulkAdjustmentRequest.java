/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailBulkAdjustmentRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvoiceDetailBulkAdjustment related UdtRequests
 *
 */

public abstract class InvoiceDetailBulkAdjustmentRequest extends UdtRequest {

/**
 *
 * Constructor for InvoiceDetailBulkAdjustmentRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvoiceDetailBulkAdjustmentRequest(String id, String method) {
    super(id, "InvoiceDetailBulkAdjustment", method);
  }
}
