/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageCreditRateSubRequestParent.java
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
 * Abstract base class for all UsageCreditRate related UdtSubRequestParents
 *
 */
public abstract class UsageCreditRateSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on UsageCreditRateRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsageCreditRateRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UsageCreditRateSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsageCreditRateSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for UsageCreditRateSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UsageCreditRateSubRequestParent(String id, String method) {
    super(id, "UsageCreditRate", method);
  }
}
