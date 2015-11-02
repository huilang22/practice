/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvAutoActionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvAutoAction related UdtRequests
 *
 */

public abstract class InvAutoActionRequest extends UdtRequest {

/**
 *
 * Constructor for InvAutoActionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvAutoActionRequest(String id, String method) {
    super(id, "InvAutoAction", method);
  }
}
