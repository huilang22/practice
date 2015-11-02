/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BulkOrderRequestRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BulkOrderRequest related UdtRequests
 *
 */

public abstract class BulkOrderRequestRequest extends UdtRequest {

/**
 *
 * Constructor for BulkOrderRequestRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BulkOrderRequestRequest(String id, String method) {
    super(id, "BulkOrderRequest", method);
  }
}
