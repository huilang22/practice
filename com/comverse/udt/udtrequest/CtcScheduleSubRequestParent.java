/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcScheduleSubRequestParent.java
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
 * Abstract base class for all CtcSchedule related UdtSubRequestParents
 *
 */
public abstract class CtcScheduleSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcScheduleRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcScheduleRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcScheduleSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcScheduleSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcScheduleSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcScheduleSubRequestParent(String id, String method) {
    super(id, "CtcSchedule", method);
  }
}
