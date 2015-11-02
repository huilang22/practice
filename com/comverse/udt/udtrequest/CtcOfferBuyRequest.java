/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcOfferBuy related UdtRequests
 *
 */

public abstract class CtcOfferBuyRequest extends UdtRequest {

/**
 *
 * Constructor for CtcOfferBuyRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcOfferBuyRequest(String id, String method) {
    super(id, "CtcOfferBuy", method);
  }
}
