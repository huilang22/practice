/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateEpiSubRequestParent.java
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
 * Abstract base class for all RateEpi related UdtSubRequestParents
 *
 */
public abstract class RateEpiSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RateEpiRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateEpiRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RateEpiSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateEpiSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RateEpiSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RateEpiSubRequestParent(String id, String method) {
    super(id, "RateEpi", method);
  }
}
