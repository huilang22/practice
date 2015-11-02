/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcOffer related UdtRequests
 *
 */

public abstract class CtcOfferRequest extends UdtRequest {

/**
 *
 * Constructor for CtcOfferRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcOfferRequest(String id, String method) {
    super(id, "CtcOffer", method);
  }
}
