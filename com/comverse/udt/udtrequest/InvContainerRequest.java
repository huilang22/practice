/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvContainer related UdtRequests
 *
 */

public abstract class InvContainerRequest extends UdtRequest {

/**
 *
 * Constructor for InvContainerRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvContainerRequest(String id, String method) {
    super(id, "InvContainer", method);
  }
}
