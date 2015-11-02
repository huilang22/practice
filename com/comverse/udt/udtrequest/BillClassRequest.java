/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillClassRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BillClass related UdtRequests
 *
 */

public abstract class BillClassRequest extends UdtRequest {

/**
 *
 * Constructor for BillClassRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BillClassRequest(String id, String method) {
    super(id, "BillClass", method);
  }
}
