/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferSubRequestParent.java
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
 * Abstract base class for all CtcOffer related UdtSubRequestParents
 *
 */
public abstract class CtcOfferSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcOfferRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcOfferRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcOfferSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcOfferSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcOfferSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcOfferSubRequestParent(String id, String method) {
    super(id, "CtcOffer", method);
  }
}
