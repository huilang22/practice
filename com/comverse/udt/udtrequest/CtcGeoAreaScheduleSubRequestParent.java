/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGeoAreaScheduleSubRequestParent.java
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
 * Abstract base class for all CtcGeoAreaSchedule related UdtSubRequestParents
 *
 */
public abstract class CtcGeoAreaScheduleSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcGeoAreaScheduleRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcGeoAreaScheduleRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcGeoAreaScheduleSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcGeoAreaScheduleSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcGeoAreaScheduleSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcGeoAreaScheduleSubRequestParent(String id, String method) {
    super(id, "CtcGeoAreaSchedule", method);
  }
}
