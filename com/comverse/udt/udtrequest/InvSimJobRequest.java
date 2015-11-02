/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimJobRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvSimJob related UdtRequests
 *
 */

public abstract class InvSimJobRequest extends UdtRequest {

/**
 *
 * Constructor for InvSimJobRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvSimJobRequest(String id, String method) {
    super(id, "InvSimJob", method);
  }
}
