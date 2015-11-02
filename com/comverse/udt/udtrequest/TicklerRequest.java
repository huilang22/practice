/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TicklerRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Tickler related UdtRequests
 *
 */

public abstract class TicklerRequest extends UdtRequest {

/**
 *
 * Constructor for TicklerRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public TicklerRequest(String id, String method) {
    super(id, "Tickler", method);
  }
}
