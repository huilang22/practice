/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerLifetimeIdRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CustomerLifetimeId related UdtRequests
 *
 */

public abstract class CustomerLifetimeIdRequest extends UdtRequest {

/**
 *
 * Constructor for CustomerLifetimeIdRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CustomerLifetimeIdRequest(String id, String method) {
    super(id, "CustomerLifetimeId", method);
  }
}
