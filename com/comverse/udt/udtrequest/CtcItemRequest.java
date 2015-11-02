/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcItem related UdtRequests
 *
 */

public abstract class CtcItemRequest extends UdtRequest {

/**
 *
 * Constructor for CtcItemRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcItemRequest(String id, String method) {
    super(id, "CtcItem", method);
  }
}
