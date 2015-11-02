/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountTargetRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all DiscountTarget related UdtRequests
 *
 */

public abstract class DiscountTargetRequest extends UdtRequest {

/**
 *
 * Constructor for DiscountTargetRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public DiscountTargetRequest(String id, String method) {
    super(id, "DiscountTarget", method);
  }
}
