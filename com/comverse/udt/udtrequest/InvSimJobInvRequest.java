/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimJobInvRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvSimJobInv related UdtRequests
 *
 */

public abstract class InvSimJobInvRequest extends UdtRequest {

/**
 *
 * Constructor for InvSimJobInvRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvSimJobInvRequest(String id, String method) {
    super(id, "InvSimJobInv", method);
  }
}
