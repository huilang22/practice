/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowInstRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all WorkflowInst related UdtRequests
 *
 */

public abstract class WorkflowInstRequest extends UdtRequest {

/**
 *
 * Constructor for WorkflowInstRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public WorkflowInstRequest(String id, String method) {
    super(id, "WorkflowInst", method);
  }
}
