/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepartmentRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Department related UdtRequests
 *
 */

public abstract class DepartmentRequest extends UdtRequest {

/**
 *
 * Constructor for DepartmentRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public DepartmentRequest(String id, String method) {
    super(id, "Department", method);
  }
}
