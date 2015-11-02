/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanGroupSubRequestParent.java
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
 * Abstract base class for all CorridorPlanGroup related UdtSubRequestParents
 *
 */
public abstract class CorridorPlanGroupSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CorridorPlanGroupRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CorridorPlanGroupRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CorridorPlanGroupSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CorridorPlanGroupSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CorridorPlanGroupSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CorridorPlanGroupSubRequestParent(String id, String method) {
    super(id, "CorridorPlanGroup", method);
  }
}
