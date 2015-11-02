/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherHistoryRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all VoucherHistory related UdtRequests
 *
 */

public abstract class VoucherHistoryRequest extends UdtRequest {

/**
 *
 * Constructor for VoucherHistoryRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public VoucherHistoryRequest(String id, String method) {
    super(id, "VoucherHistory", method);
  }
}
