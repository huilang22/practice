/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Workflow related UdtSubRequestParents
 *
 */
public abstract class WorkflowSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on WorkflowRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(WorkflowRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on WorkflowSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(WorkflowSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for WorkflowSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public WorkflowSubRequestParent(String id, String method) {
    super(id, "Workflow", method);
  }
}
