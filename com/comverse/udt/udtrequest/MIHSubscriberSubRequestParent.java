/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MIHSubscriberSubRequestParent.java
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
 * Abstract base class for all MIHSubscriber related UdtSubRequestParents
 *
 */
public abstract class MIHSubscriberSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on MIHSubscriberRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(MIHSubscriberRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on MIHSubscriberSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(MIHSubscriberSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for MIHSubscriberSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public MIHSubscriberSubRequestParent(String id, String method) {
    super(id, "MIHSubscriber", method);
  }
}
