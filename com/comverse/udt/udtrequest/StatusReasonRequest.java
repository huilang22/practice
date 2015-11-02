/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all StatusReason related UdtRequests
 *
 */

public abstract class StatusReasonRequest extends UdtRequest {

/**
 *
 * Constructor for StatusReasonRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public StatusReasonRequest(String id, String method) {
    super(id, "StatusReason", method);
  }
}
