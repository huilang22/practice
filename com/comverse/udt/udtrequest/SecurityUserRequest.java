/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityUserRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all SecurityUser related UdtRequests
 *
 */

public abstract class SecurityUserRequest extends UdtRequest {

/**
 *
 * Constructor for SecurityUserRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SecurityUserRequest(String id, String method) {
    super(id, "SecurityUser", method);
  }
}
