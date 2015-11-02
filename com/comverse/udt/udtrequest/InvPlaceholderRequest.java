/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvPlaceholderRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvPlaceholder related UdtRequests
 *
 */

public abstract class InvPlaceholderRequest extends UdtRequest {

/**
 *
 * Constructor for InvPlaceholderRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvPlaceholderRequest(String id, String method) {
    super(id, "InvPlaceholder", method);
  }
}
