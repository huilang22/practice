/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvAutoAssocRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvAutoAssoc related UdtRequests
 *
 */

public abstract class InvAutoAssocRequest extends UdtRequest {

/**
 *
 * Constructor for InvAutoAssocRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvAutoAssocRequest(String id, String method) {
    super(id, "InvAutoAssoc", method);
  }
}
