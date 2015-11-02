/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateNrcSubRequestParent.java
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
 * Abstract base class for all RateNrc related UdtSubRequestParents
 *
 */
public abstract class RateNrcSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RateNrcRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateNrcRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RateNrcSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateNrcSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RateNrcSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RateNrcSubRequestParent(String id, String method) {
    super(id, "RateNrc", method);
  }
}
