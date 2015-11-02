/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferExtendedDataSubRequestParent.java
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
 * Abstract base class for all CtcOfferExtendedData related UdtSubRequestParents
 *
 */
public abstract class CtcOfferExtendedDataSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcOfferExtendedDataRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcOfferExtendedDataRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcOfferExtendedDataSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcOfferExtendedDataSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcOfferExtendedDataSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcOfferExtendedDataSubRequestParent(String id, String method) {
    super(id, "CtcOfferExtendedData", method);
  }
}
