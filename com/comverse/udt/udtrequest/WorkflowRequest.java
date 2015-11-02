/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Workflow related UdtRequests
 *
 */

public abstract class WorkflowRequest extends UdtRequest {

/**
 *
 * Constructor for WorkflowRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public WorkflowRequest(String id, String method) {
    super(id, "Workflow", method);
  }
}
