/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuySubRequestParent.java
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
 * Abstract base class for all CtcOfferBuy related UdtSubRequestParents
 *
 */
public abstract class CtcOfferBuySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcOfferBuyRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcOfferBuyRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcOfferBuySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcOfferBuySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcOfferBuySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcOfferBuySubRequestParent(String id, String method) {
    super(id, "CtcOfferBuy", method);
  }
}
