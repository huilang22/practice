/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderWorkflowMapSubRequestParent.java
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
 * Abstract base class for all ServiceOrderWorkflowMap related UdtSubRequestParents
 *
 */
public abstract class ServiceOrderWorkflowMapSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServiceOrderWorkflowMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceOrderWorkflowMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceOrderWorkflowMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceOrderWorkflowMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServiceOrderWorkflowMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceOrderWorkflowMapSubRequestParent(String id, String method) {
    super(id, "ServiceOrderWorkflowMap", method);
  }
}
