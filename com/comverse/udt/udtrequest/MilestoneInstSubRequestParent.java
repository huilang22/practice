/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstSubRequestParent.java
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
 * Abstract base class for all MilestoneInst related UdtSubRequestParents
 *
 */
public abstract class MilestoneInstSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on MilestoneInstRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(MilestoneInstRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on MilestoneInstSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(MilestoneInstSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for MilestoneInstSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public MilestoneInstSubRequestParent(String id, String method) {
    super(id, "MilestoneInst", method);
  }
}
