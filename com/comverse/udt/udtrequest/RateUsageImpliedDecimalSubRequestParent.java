/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageImpliedDecimalSubRequestParent.java
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
 * Abstract base class for all RateUsageImpliedDecimal related UdtSubRequestParents
 *
 */
public abstract class RateUsageImpliedDecimalSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RateUsageImpliedDecimalRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateUsageImpliedDecimalRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RateUsageImpliedDecimalSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateUsageImpliedDecimalSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RateUsageImpliedDecimalSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RateUsageImpliedDecimalSubRequestParent(String id, String method) {
    super(id, "RateUsageImpliedDecimal", method);
  }
}
