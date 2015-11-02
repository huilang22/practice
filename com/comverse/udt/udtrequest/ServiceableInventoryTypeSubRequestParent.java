/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableInventoryTypeSubRequestParent.java
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
 * Abstract base class for all ServiceableInventoryType related UdtSubRequestParents
 *
 */
public abstract class ServiceableInventoryTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServiceableInventoryTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceableInventoryTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceableInventoryTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceableInventoryTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServiceableInventoryTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceableInventoryTypeSubRequestParent(String id, String method) {
    super(id, "ServiceableInventoryType", method);
  }
}
