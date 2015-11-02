/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSalesChannelSubRequestParent.java
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
 * Abstract base class for all InvsSalesChannel related UdtSubRequestParents
 *
 */
public abstract class InvsSalesChannelSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsSalesChannelRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSalesChannelRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsSalesChannelSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSalesChannelSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsSalesChannelSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsSalesChannelSubRequestParent(String id, String method) {
    super(id, "InvsSalesChannel", method);
  }
}
