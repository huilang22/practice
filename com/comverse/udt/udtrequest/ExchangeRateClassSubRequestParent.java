/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExchangeRateClassSubRequestParent.java
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
 * Abstract base class for all ExchangeRateClass related UdtSubRequestParents
 *
 */
public abstract class ExchangeRateClassSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ExchangeRateClassRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExchangeRateClassRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ExchangeRateClassSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExchangeRateClassSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ExchangeRateClassSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ExchangeRateClassSubRequestParent(String id, String method) {
    super(id, "ExchangeRateClass", method);
  }
}
