/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmTableRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtmTable related UdtRequests
 *
 */

public abstract class CtmTableRequest extends UdtRequest {

/**
 *
 * Constructor for CtmTableRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtmTableRequest(String id, String method) {
    super(id, "CtmTable", method);
  }
}
