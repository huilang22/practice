/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcProductRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all SvcProduct related UdtRequests
 *
 */

public abstract class SvcProductRequest extends UdtRequest {

/**
 *
 * Constructor for SvcProductRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SvcProductRequest(String id, String method) {
    super(id, "SvcProduct", method);
  }
}
