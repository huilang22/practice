/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowTransSubRequestParent.java
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
 * Abstract base class for all WorkflowTrans related UdtSubRequestParents
 *
 */
public abstract class WorkflowTransSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on WorkflowTransRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(WorkflowTransRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on WorkflowTransSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(WorkflowTransSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for WorkflowTransSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public WorkflowTransSubRequestParent(String id, String method) {
    super(id, "WorkflowTrans", method);
  }
}
