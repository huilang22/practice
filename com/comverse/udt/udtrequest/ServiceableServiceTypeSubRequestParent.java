/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableServiceTypeSubRequestParent.java
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
 * Abstract base class for all ServiceableServiceType related UdtSubRequestParents
 *
 */
public abstract class ServiceableServiceTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServiceableServiceTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceableServiceTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceableServiceTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceableServiceTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServiceableServiceTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceableServiceTypeSubRequestParent(String id, String method) {
    super(id, "ServiceableServiceType", method);
  }
}
