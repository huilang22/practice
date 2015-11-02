/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyMethodRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcOfferBuyMethod related UdtRequests
 *
 */

public abstract class CtcOfferBuyMethodRequest extends UdtRequest {

/**
 *
 * Constructor for CtcOfferBuyMethodRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcOfferBuyMethodRequest(String id, String method) {
    super(id, "CtcOfferBuyMethod", method);
  }
}
