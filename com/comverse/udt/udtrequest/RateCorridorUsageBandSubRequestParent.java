/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageBandSubRequestParent.java
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
 * Abstract base class for all RateCorridorUsageBand related UdtSubRequestParents
 *
 */
public abstract class RateCorridorUsageBandSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RateCorridorUsageBandRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateCorridorUsageBandRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RateCorridorUsageBandSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateCorridorUsageBandSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RateCorridorUsageBandSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RateCorridorUsageBandSubRequestParent(String id, String method) {
    super(id, "RateCorridorUsageBand", method);
  }
}
