/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsType related UdtRequests
 *
 */

public abstract class InvsTypeRequest extends UdtRequest {

/**
 *
 * Constructor for InvsTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsTypeRequest(String id, String method) {
    super(id, "InvsType", method);
  }
}
