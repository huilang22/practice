/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskPriorityRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CitTaskPriority related UdtRequests
 *
 */

public abstract class CitTaskPriorityRequest extends UdtRequest {

/**
 *
 * Constructor for CitTaskPriorityRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CitTaskPriorityRequest(String id, String method) {
    super(id, "CitTaskPriority", method);
  }
}
