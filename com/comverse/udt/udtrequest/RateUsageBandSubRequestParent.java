/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageBandSubRequestParent.java
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
 * Abstract base class for all RateUsageBand related UdtSubRequestParents
 *
 */
public abstract class RateUsageBandSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RateUsageBandRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateUsageBandRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RateUsageBandSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateUsageBandSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RateUsageBandSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RateUsageBandSubRequestParent(String id, String method) {
    super(id, "RateUsageBand", method);
  }
}
