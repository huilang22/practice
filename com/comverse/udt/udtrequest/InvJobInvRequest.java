/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobInvRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvJobInv related UdtRequests
 *
 */

public abstract class InvJobInvRequest extends UdtRequest {

/**
 *
 * Constructor for InvJobInvRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvJobInvRequest(String id, String method) {
    super(id, "InvJobInv", method);
  }
}
