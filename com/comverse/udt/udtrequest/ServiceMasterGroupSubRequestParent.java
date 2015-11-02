/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceMasterGroupSubRequestParent.java
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
 * Abstract base class for all ServiceMasterGroup related UdtSubRequestParents
 *
 */
public abstract class ServiceMasterGroupSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServiceMasterGroupRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceMasterGroupRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceMasterGroupSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceMasterGroupSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServiceMasterGroupSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceMasterGroupSubRequestParent(String id, String method) {
    super(id, "ServiceMasterGroup", method);
  }
}
