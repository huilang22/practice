/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Policy related UdtRequests
 *
 */

public abstract class PolicyRequest extends UdtRequest {

/**
 *
 * Constructor for PolicyRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public PolicyRequest(String id, String method) {
    super(id, "Policy", method);
  }
}
