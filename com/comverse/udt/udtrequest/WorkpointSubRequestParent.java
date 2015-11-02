/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkpointSubRequestParent.java
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
 * Abstract base class for all Workpoint related UdtSubRequestParents
 *
 */
public abstract class WorkpointSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on WorkpointRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(WorkpointRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on WorkpointSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(WorkpointSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for WorkpointSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public WorkpointSubRequestParent(String id, String method) {
    super(id, "Workpoint", method);
  }
}
