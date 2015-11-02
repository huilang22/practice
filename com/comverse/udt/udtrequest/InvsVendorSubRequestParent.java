/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorSubRequestParent.java
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
 * Abstract base class for all InvsVendor related UdtSubRequestParents
 *
 */
public abstract class InvsVendorSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsVendorRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsVendorRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsVendorSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsVendorSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsVendorSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsVendorSubRequestParent(String id, String method) {
    super(id, "InvsVendor", method);
  }
}
