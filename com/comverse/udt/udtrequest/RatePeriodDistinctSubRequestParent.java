/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodDistinctSubRequestParent.java
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
 * Abstract base class for all RatePeriodDistinct related UdtSubRequestParents
 *
 */
public abstract class RatePeriodDistinctSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RatePeriodDistinctRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RatePeriodDistinctRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RatePeriodDistinctSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RatePeriodDistinctSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RatePeriodDistinctSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RatePeriodDistinctSubRequestParent(String id, String method) {
    super(id, "RatePeriodDistinct", method);
  }
}
