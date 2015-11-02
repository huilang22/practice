/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServServiceTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServServiceType related UdtRequests
 *
 */

public abstract class ServServiceTypeRequest extends UdtRequest {

/**
 *
 * Constructor for ServServiceTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServServiceTypeRequest(String id, String method) {
    super(id, "ServServiceType", method);
  }
}
