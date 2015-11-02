/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityRoleRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all SecurityRole related UdtRequests
 *
 */

public abstract class SecurityRoleRequest extends UdtRequest {

/**
 *
 * Constructor for SecurityRoleRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SecurityRoleRequest(String id, String method) {
    super(id, "SecurityRole", method);
  }
}
