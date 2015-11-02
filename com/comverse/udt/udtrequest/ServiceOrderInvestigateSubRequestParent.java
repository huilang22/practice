/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderInvestigateSubRequestParent.java
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
 * Abstract base class for all ServiceOrderInvestigate related UdtSubRequestParents
 *
 */
public abstract class ServiceOrderInvestigateSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServiceOrderInvestigateRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceOrderInvestigateRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceOrderInvestigateSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceOrderInvestigateSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServiceOrderInvestigateSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceOrderInvestigateSubRequestParent(String id, String method) {
    super(id, "ServiceOrderInvestigate", method);
  }
}
