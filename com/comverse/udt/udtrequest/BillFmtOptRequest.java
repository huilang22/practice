/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BillFmtOpt related UdtRequests
 *
 */

public abstract class BillFmtOptRequest extends UdtRequest {

/**
 *
 * Constructor for BillFmtOptRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BillFmtOptRequest(String id, String method) {
    super(id, "BillFmtOpt", method);
  }
}
