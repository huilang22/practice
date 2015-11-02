/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCurrencySubRequestParent.java
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
 * Abstract base class for all RateCurrency related UdtSubRequestParents
 *
 */
public abstract class RateCurrencySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RateCurrencyRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateCurrencyRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RateCurrencySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateCurrencySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RateCurrencySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RateCurrencySubRequestParent(String id, String method) {
    super(id, "RateCurrency", method);
  }
}
