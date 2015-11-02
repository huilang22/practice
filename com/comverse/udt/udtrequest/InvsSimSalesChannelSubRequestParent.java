/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelSubRequestParent.java
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
 * Abstract base class for all InvsSimSalesChannel related UdtSubRequestParents
 *
 */
public abstract class InvsSimSalesChannelSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsSimSalesChannelRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSimSalesChannelRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsSimSalesChannelSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSimSalesChannelSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsSimSalesChannelSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsSimSalesChannelSubRequestParent(String id, String method) {
    super(id, "InvsSimSalesChannel", method);
  }
}
