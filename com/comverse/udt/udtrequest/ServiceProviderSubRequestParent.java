/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceProviderSubRequestParent.java
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
 * Abstract base class for all ServiceProvider related UdtSubRequestParents
 *
 */
public abstract class ServiceProviderSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServiceProviderRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceProviderRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceProviderSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceProviderSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServiceProviderSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceProviderSubRequestParent(String id, String method) {
    super(id, "ServiceProvider", method);
  }
}
