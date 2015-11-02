/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstHstrySubRequestParent.java
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
 * Abstract base class for all MilestoneInstHstry related UdtSubRequestParents
 *
 */
public abstract class MilestoneInstHstrySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on MilestoneInstHstryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(MilestoneInstHstryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on MilestoneInstHstrySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(MilestoneInstHstrySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for MilestoneInstHstrySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public MilestoneInstHstrySubRequestParent(String id, String method) {
    super(id, "MilestoneInstHstry", method);
  }
}
