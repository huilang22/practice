/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrCalendarSubRequestParent.java
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
 * Abstract base class for all RbrCalendar related UdtSubRequestParents
 *
 */
public abstract class RbrCalendarSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RbrCalendarRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrCalendarRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RbrCalendarSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrCalendarSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RbrCalendarSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RbrCalendarSubRequestParent(String id, String method) {
    super(id, "RbrCalendar", method);
  }
}
