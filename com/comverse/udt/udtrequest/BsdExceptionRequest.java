/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdException related UdtRequests
 *
 */

public abstract class BsdExceptionRequest extends UdtRequest {

/**
 *
 * Constructor for BsdExceptionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdExceptionRequest(String id, String method) {
    super(id, "BsdException", method);
  }
}
