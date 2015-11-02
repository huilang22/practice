/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainHistoryRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvdMainHistory related UdtRequests
 *
 */

public abstract class InvdMainHistoryRequest extends UdtRequest {

/**
 *
 * Constructor for InvdMainHistoryRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvdMainHistoryRequest(String id, String method) {
    super(id, "InvdMainHistory", method);
  }
}
