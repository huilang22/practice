/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvHistoryRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvHistory related UdtRequests
 *
 */

public abstract class InvHistoryRequest extends UdtRequest {

/**
 *
 * Constructor for InvHistoryRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvHistoryRequest(String id, String method) {
    super(id, "InvHistory", method);
  }
}
