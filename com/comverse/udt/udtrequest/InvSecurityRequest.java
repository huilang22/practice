/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSecurityRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvSecurity related UdtRequests
 *
 */

public abstract class InvSecurityRequest extends UdtRequest {

/**
 *
 * Constructor for InvSecurityRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvSecurityRequest(String id, String method) {
    super(id, "InvSecurity", method);
  }
}
