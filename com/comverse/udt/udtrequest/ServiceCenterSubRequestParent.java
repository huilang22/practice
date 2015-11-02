/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterSubRequestParent.java
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
 * Abstract base class for all ServiceCenter related UdtSubRequestParents
 *
 */
public abstract class ServiceCenterSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServiceCenterRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceCenterRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceCenterSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceCenterSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServiceCenterSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceCenterSubRequestParent(String id, String method) {
    super(id, "ServiceCenter", method);
  }
}
