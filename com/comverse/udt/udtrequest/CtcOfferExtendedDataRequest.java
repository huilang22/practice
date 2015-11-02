/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferExtendedDataRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcOfferExtendedData related UdtRequests
 *
 */

public abstract class CtcOfferExtendedDataRequest extends UdtRequest {

/**
 *
 * Constructor for CtcOfferExtendedDataRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcOfferExtendedDataRequest(String id, String method) {
    super(id, "CtcOfferExtendedData", method);
  }
}
