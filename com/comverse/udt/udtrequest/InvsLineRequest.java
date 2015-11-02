/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsLine related UdtRequests
 *
 */

public abstract class InvsLineRequest extends UdtRequest {

/**
 *
 * Constructor for InvsLineRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsLineRequest(String id, String method) {
    super(id, "InvsLine", method);
  }
}
