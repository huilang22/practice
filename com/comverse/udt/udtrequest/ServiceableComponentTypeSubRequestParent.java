/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableComponentTypeSubRequestParent.java
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
 * Abstract base class for all ServiceableComponentType related UdtSubRequestParents
 *
 */
public abstract class ServiceableComponentTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServiceableComponentTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceableComponentTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceableComponentTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceableComponentTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServiceableComponentTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceableComponentTypeSubRequestParent(String id, String method) {
    super(id, "ServiceableComponentType", method);
  }
}
