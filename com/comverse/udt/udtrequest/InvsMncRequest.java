/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMncRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsMnc related UdtRequests
 *
 */

public abstract class InvsMncRequest extends UdtRequest {

/**
 *
 * Constructor for InvsMncRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsMncRequest(String id, String method) {
    super(id, "InvsMnc", method);
  }
}
