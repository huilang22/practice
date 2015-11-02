/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderTypeSubRequestParent.java
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
 * Abstract base class for all ServiceOrderType related UdtSubRequestParents
 *
 */
public abstract class ServiceOrderTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServiceOrderTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceOrderTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceOrderTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceOrderTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServiceOrderTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceOrderTypeSubRequestParent(String id, String method) {
    super(id, "ServiceOrderType", method);
  }
}
