/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundReasonRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RefundReason related UdtRequests
 *
 */

public abstract class RefundReasonRequest extends UdtRequest {

/**
 *
 * Constructor for RefundReasonRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RefundReasonRequest(String id, String method) {
    super(id, "RefundReason", method);
  }
}
