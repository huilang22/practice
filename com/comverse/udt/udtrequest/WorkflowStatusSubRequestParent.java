/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowStatusSubRequestParent.java
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
 * Abstract base class for all WorkflowStatus related UdtSubRequestParents
 *
 */
public abstract class WorkflowStatusSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on WorkflowStatusRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(WorkflowStatusRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on WorkflowStatusSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(WorkflowStatusSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for WorkflowStatusSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public WorkflowStatusSubRequestParent(String id, String method) {
    super(id, "WorkflowStatus", method);
  }
}
