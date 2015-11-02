/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimePeriodSubRequestParent.java
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
 * Abstract base class for all RbrTimePeriod related UdtSubRequestParents
 *
 */
public abstract class RbrTimePeriodSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RbrTimePeriodRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrTimePeriodRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RbrTimePeriodSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrTimePeriodSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RbrTimePeriodSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RbrTimePeriodSubRequestParent(String id, String method) {
    super(id, "RbrTimePeriod", method);
  }
}
