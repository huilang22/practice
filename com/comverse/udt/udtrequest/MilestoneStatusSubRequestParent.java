/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneStatusSubRequestParent.java
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
 * Abstract base class for all MilestoneStatus related UdtSubRequestParents
 *
 */
public abstract class MilestoneStatusSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on MilestoneStatusRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(MilestoneStatusRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on MilestoneStatusSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(MilestoneStatusSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for MilestoneStatusSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public MilestoneStatusSubRequestParent(String id, String method) {
    super(id, "MilestoneStatus", method);
  }
}
