/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowStatusRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all WorkflowStatus related UdtRequests
 *
 */

public abstract class WorkflowStatusRequest extends UdtRequest {

/**
 *
 * Constructor for WorkflowStatusRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public WorkflowStatusRequest(String id, String method) {
    super(id, "WorkflowStatus", method);
  }
}
