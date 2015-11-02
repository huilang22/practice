/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateRcSubRequestParent.java
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
 * Abstract base class for all RateRc related UdtSubRequestParents
 *
 */
public abstract class RateRcSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RateRcRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateRcRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RateRcSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateRcSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RateRcSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RateRcSubRequestParent(String id, String method) {
    super(id, "RateRc", method);
  }
}
