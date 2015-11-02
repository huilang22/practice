/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountRestrictionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all DiscountRestriction related UdtRequests
 *
 */

public abstract class DiscountRestrictionRequest extends UdtRequest {

/**
 *
 * Constructor for DiscountRestrictionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public DiscountRestrictionRequest(String id, String method) {
    super(id, "DiscountRestriction", method);
  }
}
