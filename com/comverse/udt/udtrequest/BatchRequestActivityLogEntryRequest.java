/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestActivityLogEntryRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchRequestActivityLogEntry related UdtRequests
 *
 */

public abstract class BatchRequestActivityLogEntryRequest extends UdtRequest {

/**
 *
 * Constructor for BatchRequestActivityLogEntryRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BatchRequestActivityLogEntryRequest(String id, String method) {
    super(id, "BatchRequestActivityLogEntry", method);
  }
}
