/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobHistoryRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvJobHistory related UdtRequests
 *
 */

public abstract class InvJobHistoryRequest extends UdtRequest {

/**
 *
 * Constructor for InvJobHistoryRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvJobHistoryRequest(String id, String method) {
    super(id, "InvJobHistory", method);
  }
}
