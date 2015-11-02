/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskPrioritySubRequestParent.java
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
 * Abstract base class for all CitTaskPriority related UdtSubRequestParents
 *
 */
public abstract class CitTaskPrioritySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CitTaskPriorityRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CitTaskPriorityRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CitTaskPrioritySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CitTaskPrioritySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CitTaskPrioritySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CitTaskPrioritySubRequestParent(String id, String method) {
    super(id, "CitTaskPriority", method);
  }
}
