/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowTransRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all WorkflowTrans related UdtRequests
 *
 */

public abstract class WorkflowTransRequest extends UdtRequest {

/**
 *
 * Constructor for WorkflowTransRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public WorkflowTransRequest(String id, String method) {
    super(id, "WorkflowTrans", method);
  }
}
