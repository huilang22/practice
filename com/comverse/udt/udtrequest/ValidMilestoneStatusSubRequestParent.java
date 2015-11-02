/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ValidMilestoneStatusSubRequestParent.java
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
 * Abstract base class for all ValidMilestoneStatus related UdtSubRequestParents
 *
 */
public abstract class ValidMilestoneStatusSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ValidMilestoneStatusRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ValidMilestoneStatusRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ValidMilestoneStatusSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ValidMilestoneStatusSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ValidMilestoneStatusSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ValidMilestoneStatusSubRequestParent(String id, String method) {
    super(id, "ValidMilestoneStatus", method);
  }
}
