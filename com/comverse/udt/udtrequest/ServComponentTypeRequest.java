/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServComponentTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServComponentType related UdtRequests
 *
 */

public abstract class ServComponentTypeRequest extends UdtRequest {

/**
 *
 * Constructor for ServComponentTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServComponentTypeRequest(String id, String method) {
    super(id, "ServComponentType", method);
  }
}
