/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyInstanceRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all PolicyInstance related UdtRequests
 *
 */

public abstract class PolicyInstanceRequest extends UdtRequest {

/**
 *
 * Constructor for PolicyInstanceRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public PolicyInstanceRequest(String id, String method) {
    super(id, "PolicyInstance", method);
  }
}
