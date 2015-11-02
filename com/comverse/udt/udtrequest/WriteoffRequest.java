/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WriteoffRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Writeoff related UdtRequests
 *
 */

public abstract class WriteoffRequest extends UdtRequest {

/**
 *
 * Constructor for WriteoffRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public WriteoffRequest(String id, String method) {
    super(id, "Writeoff", method);
  }
}
