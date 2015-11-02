/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageSubRequestParent.java
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
 * Abstract base class for all RateUsage related UdtSubRequestParents
 *
 */
public abstract class RateUsageSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RateUsageRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateUsageRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RateUsageSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateUsageSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RateUsageSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RateUsageSubRequestParent(String id, String method) {
    super(id, "RateUsage", method);
  }
}
