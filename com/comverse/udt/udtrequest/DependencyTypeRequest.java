/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all DependencyType related UdtRequests
 *
 */

public abstract class DependencyTypeRequest extends UdtRequest {

/**
 *
 * Constructor for DependencyTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public DependencyTypeRequest(String id, String method) {
    super(id, "DependencyType", method);
  }
}
