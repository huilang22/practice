/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferCategoryRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcOfferCategory related UdtRequests
 *
 */

public abstract class CtcOfferCategoryRequest extends UdtRequest {

/**
 *
 * Constructor for CtcOfferCategoryRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcOfferCategoryRequest(String id, String method) {
    super(id, "CtcOfferCategory", method);
  }
}
