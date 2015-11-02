/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderDependencySubRequestParent.java
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
 * Abstract base class for all ServiceOrderDependency related UdtSubRequestParents
 *
 */
public abstract class ServiceOrderDependencySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServiceOrderDependencyRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceOrderDependencyRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceOrderDependencySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceOrderDependencySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServiceOrderDependencySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceOrderDependencySubRequestParent(String id, String method) {
    super(id, "ServiceOrderDependency", method);
  }
}
