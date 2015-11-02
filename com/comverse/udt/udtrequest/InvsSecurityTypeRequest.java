/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSecurityTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsSecurityType related UdtRequests
 *
 */

public abstract class InvsSecurityTypeRequest extends UdtRequest {

/**
 *
 * Constructor for InvsSecurityTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsSecurityTypeRequest(String id, String method) {
    super(id, "InvsSecurityType", method);
  }
}
