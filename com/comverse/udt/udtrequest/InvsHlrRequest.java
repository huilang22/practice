/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsHlrRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsHlr related UdtRequests
 *
 */

public abstract class InvsHlrRequest extends UdtRequest {

/**
 *
 * Constructor for InvsHlrRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsHlrRequest(String id, String method) {
    super(id, "InvsHlr", method);
  }
}
