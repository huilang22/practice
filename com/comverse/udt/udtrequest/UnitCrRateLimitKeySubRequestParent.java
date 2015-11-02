/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitKeySubRequestParent.java
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
 * Abstract base class for all UnitCrRateLimitKey related UdtSubRequestParents
 *
 */
public abstract class UnitCrRateLimitKeySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on UnitCrRateLimitKeyRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UnitCrRateLimitKeyRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UnitCrRateLimitKeySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UnitCrRateLimitKeySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for UnitCrRateLimitKeySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UnitCrRateLimitKeySubRequestParent(String id, String method) {
    super(id, "UnitCrRateLimitKey", method);
  }
}
