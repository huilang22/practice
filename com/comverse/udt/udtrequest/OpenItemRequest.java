/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all OpenItem related UdtRequests
 *
 */

public abstract class OpenItemRequest extends UdtRequest {

/**
 *
 * Constructor for OpenItemRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public OpenItemRequest(String id, String method) {
    super(id, "OpenItem", method);
  }
}
