/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupProductRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all HqGroupProduct related UdtRequests
 *
 */

public abstract class HqGroupProductRequest extends UdtRequest {

/**
 *
 * Constructor for HqGroupProductRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public HqGroupProductRequest(String id, String method) {
    super(id, "HqGroupProduct", method);
  }
}
