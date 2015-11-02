/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdCreditSubRequestParent.java
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
 * Abstract base class for all PlanIdCredit related UdtSubRequestParents
 *
 */
public abstract class PlanIdCreditSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PlanIdCreditRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PlanIdCreditRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PlanIdCreditSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PlanIdCreditSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PlanIdCreditSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PlanIdCreditSubRequestParent(String id, String method) {
    super(id, "PlanIdCredit", method);
  }
}
