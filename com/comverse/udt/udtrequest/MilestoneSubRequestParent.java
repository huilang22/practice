/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneSubRequestParent.java
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
 * Abstract base class for all Milestone related UdtSubRequestParents
 *
 */
public abstract class MilestoneSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on MilestoneRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(MilestoneRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on MilestoneSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(MilestoneSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for MilestoneSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public MilestoneSubRequestParent(String id, String method) {
    super(id, "Milestone", method);
  }
}
