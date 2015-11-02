/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocSubRequestParent.java
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
 * Abstract base class for all ServiceAddressAssoc related UdtSubRequestParents
 *
 */
public abstract class ServiceAddressAssocSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServiceAddressAssocRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceAddressAssocRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceAddressAssocSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceAddressAssocSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServiceAddressAssocSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceAddressAssocSubRequestParent(String id, String method) {
    super(id, "ServiceAddressAssoc", method);
  }
}
