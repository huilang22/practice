/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Dependency related UdtRequests
 *
 */

public abstract class DependencyRequest extends UdtRequest {

/**
 *
 * Constructor for DependencyRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public DependencyRequest(String id, String method) {
    super(id, "Dependency", method);
  }
}
