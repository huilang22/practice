/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelRefSubRequestParent.java
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
 * Abstract base class for all InvsSimSalesChannelRef related UdtSubRequestParents
 *
 */
public abstract class InvsSimSalesChannelRefSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsSimSalesChannelRefRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSimSalesChannelRefRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsSimSalesChannelRefSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSimSalesChannelRefSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsSimSalesChannelRefSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsSimSalesChannelRefSubRequestParent(String id, String method) {
    super(id, "InvsSimSalesChannelRef", method);
  }
}
