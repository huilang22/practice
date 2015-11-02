/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerInvRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvContainerInv related UdtRequests
 *
 */

public abstract class InvContainerInvRequest extends UdtRequest {

/**
 *
 * Constructor for InvContainerInvRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvContainerInvRequest(String id, String method) {
    super(id, "InvContainerInv", method);
  }
}
