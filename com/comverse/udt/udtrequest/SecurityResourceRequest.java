/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityResourceRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all SecurityResource related UdtRequests
 *
 */

public abstract class SecurityResourceRequest extends UdtRequest {

/**
 *
 * Constructor for SecurityResourceRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SecurityResourceRequest(String id, String method) {
    super(id, "SecurityResource", method);
  }
}
