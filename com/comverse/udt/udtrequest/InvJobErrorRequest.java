/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobErrorRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvJobError related UdtRequests
 *
 */

public abstract class InvJobErrorRequest extends UdtRequest {

/**
 *
 * Constructor for InvJobErrorRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvJobErrorRequest(String id, String method) {
    super(id, "InvJobError", method);
  }
}
