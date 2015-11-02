/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatisticTypeRefSubRequestParent.java
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
 * Abstract base class for all StatisticTypeRef related UdtSubRequestParents
 *
 */
public abstract class StatisticTypeRefSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on StatisticTypeRefRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(StatisticTypeRefRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on StatisticTypeRefSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(StatisticTypeRefSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for StatisticTypeRefSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public StatisticTypeRefSubRequestParent(String id, String method) {
    super(id, "StatisticTypeRef", method);
  }
}
