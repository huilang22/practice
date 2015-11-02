/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageSubRequestParent.java
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
 * Abstract base class for all RateCorridorUsage related UdtSubRequestParents
 *
 */
public abstract class RateCorridorUsageSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RateCorridorUsageRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateCorridorUsageRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RateCorridorUsageSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateCorridorUsageSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RateCorridorUsageSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RateCorridorUsageSubRequestParent(String id, String method) {
    super(id, "RateCorridorUsage", method);
  }
}
