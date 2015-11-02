/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTaxRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AdjustmentTax related UdtRequests
 *
 */

public abstract class AdjustmentTaxRequest extends UdtRequest {

/**
 *
 * Constructor for AdjustmentTaxRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AdjustmentTaxRequest(String id, String method) {
    super(id, "AdjustmentTax", method);
  }
}
