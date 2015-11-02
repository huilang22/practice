/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyMethodSubRequestParent.java
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
 * Abstract base class for all CtcOfferBuyMethod related UdtSubRequestParents
 *
 */
public abstract class CtcOfferBuyMethodSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcOfferBuyMethodRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcOfferBuyMethodRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcOfferBuyMethodSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcOfferBuyMethodSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcOfferBuyMethodSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcOfferBuyMethodSubRequestParent(String id, String method) {
    super(id, "CtcOfferBuyMethod", method);
  }
}
