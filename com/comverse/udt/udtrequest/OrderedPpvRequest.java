/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedPpvRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all OrderedPpv related UdtRequests
 *
 */

public abstract class OrderedPpvRequest extends UdtRequest {

/**
 *
 * Constructor for OrderedPpvRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public OrderedPpvRequest(String id, String method) {
    super(id, "OrderedPpv", method);
  }
}
