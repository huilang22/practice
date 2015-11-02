/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatisticTypeValuesSubRequestParent.java
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
 * Abstract base class for all StatisticTypeValues related UdtSubRequestParents
 *
 */
public abstract class StatisticTypeValuesSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on StatisticTypeValuesRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(StatisticTypeValuesRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on StatisticTypeValuesSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(StatisticTypeValuesSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for StatisticTypeValuesSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public StatisticTypeValuesSubRequestParent(String id, String method) {
    super(id, "StatisticTypeValues", method);
  }
}
