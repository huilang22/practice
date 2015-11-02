/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdObject related UdtRequests
 *
 */

public abstract class BsdObjectRequest extends UdtRequest {

/**
 *
 * Constructor for BsdObjectRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdObjectRequest(String id, String method) {
    super(id, "BsdObject", method);
  }
}
