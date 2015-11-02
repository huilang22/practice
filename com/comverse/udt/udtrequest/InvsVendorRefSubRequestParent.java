/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorRefSubRequestParent.java
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
 * Abstract base class for all InvsVendorRef related UdtSubRequestParents
 *
 */
public abstract class InvsVendorRefSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsVendorRefRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsVendorRefRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsVendorRefSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsVendorRefSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsVendorRefSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsVendorRefSubRequestParent(String id, String method) {
    super(id, "InvsVendorRef", method);
  }
}
