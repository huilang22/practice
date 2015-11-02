/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionGrpSubRequestParent.java
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
 * Abstract base class for all ConditionGrp related UdtSubRequestParents
 *
 */
public abstract class ConditionGrpSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ConditionGrpRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ConditionGrpRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ConditionGrpSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ConditionGrpSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ConditionGrpSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ConditionGrpSubRequestParent(String id, String method) {
    super(id, "ConditionGrp", method);
  }
}
