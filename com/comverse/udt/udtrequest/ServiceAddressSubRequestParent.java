/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressSubRequestParent.java
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
 * Abstract base class for all ServiceAddress related UdtSubRequestParents
 *
 */
public abstract class ServiceAddressSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServiceAddressRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceAddressRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceAddressSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceAddressSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServiceAddressSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceAddressSubRequestParent(String id, String method) {
    super(id, "ServiceAddress", method);
  }
}
