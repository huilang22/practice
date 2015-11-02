/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityPortalRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all SecurityPortal related UdtRequests
 *
 */

public abstract class SecurityPortalRequest extends UdtRequest {

/**
 *
 * Constructor for SecurityPortalRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SecurityPortalRequest(String id, String method) {
    super(id, "SecurityPortal", method);
  }
}
