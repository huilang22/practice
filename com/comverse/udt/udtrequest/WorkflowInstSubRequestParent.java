/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowInstSubRequestParent.java
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
 * Abstract base class for all WorkflowInst related UdtSubRequestParents
 *
 */
public abstract class WorkflowInstSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on WorkflowInstRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(WorkflowInstRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on WorkflowInstSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(WorkflowInstSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for WorkflowInstSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public WorkflowInstSubRequestParent(String id, String method) {
    super(id, "WorkflowInst", method);
  }
}
