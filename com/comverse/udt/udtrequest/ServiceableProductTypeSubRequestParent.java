/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableProductTypeSubRequestParent.java
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
 * Abstract base class for all ServiceableProductType related UdtSubRequestParents
 *
 */
public abstract class ServiceableProductTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServiceableProductTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceableProductTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceableProductTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceableProductTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServiceableProductTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceableProductTypeSubRequestParent(String id, String method) {
    super(id, "ServiceableProductType", method);
  }
}
