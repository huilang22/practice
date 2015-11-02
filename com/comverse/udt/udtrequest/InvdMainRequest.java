/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvdMain related UdtRequests
 *
 */

public abstract class InvdMainRequest extends UdtRequest {

/**
 *
 * Constructor for InvdMainRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvdMainRequest(String id, String method) {
    super(id, "InvdMain", method);
  }
}
