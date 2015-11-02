/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvModJobRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvModJob related UdtRequests
 *
 */

public abstract class InvModJobRequest extends UdtRequest {

/**
 *
 * Constructor for InvModJobRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvModJobRequest(String id, String method) {
    super(id, "InvModJob", method);
  }
}
