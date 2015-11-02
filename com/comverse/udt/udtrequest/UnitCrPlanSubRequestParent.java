/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrPlanSubRequestParent.java
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
 * Abstract base class for all UnitCrPlan related UdtSubRequestParents
 *
 */
public abstract class UnitCrPlanSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on UnitCrPlanRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UnitCrPlanRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UnitCrPlanSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UnitCrPlanSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for UnitCrPlanSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UnitCrPlanSubRequestParent(String id, String method) {
    super(id, "UnitCrPlan", method);
  }
}
