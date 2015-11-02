/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanIdSubRequestParent.java
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
 * Abstract base class for all CorridorPlanId related UdtSubRequestParents
 *
 */
public abstract class CorridorPlanIdSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CorridorPlanIdRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CorridorPlanIdRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CorridorPlanIdSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CorridorPlanIdSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CorridorPlanIdSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CorridorPlanIdSubRequestParent(String id, String method) {
    super(id, "CorridorPlanId", method);
  }
}
