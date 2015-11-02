/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitsTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UnitsType related UdtRequests
 *
 */

public abstract class UnitsTypeRequest extends UdtRequest {

/**
 *
 * Constructor for UnitsTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UnitsTypeRequest(String id, String method) {
    super(id, "UnitsType", method);
  }
}
