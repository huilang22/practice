/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedInvPlaceholderRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all OrderedInvPlaceholder related UdtRequests
 *
 */

public abstract class OrderedInvPlaceholderRequest extends UdtRequest {

/**
 *
 * Constructor for OrderedInvPlaceholderRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public OrderedInvPlaceholderRequest(String id, String method) {
    super(id, "OrderedInvPlaceholder", method);
  }
}
