/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServPackageTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServPackageType related UdtRequests
 *
 */

public abstract class ServPackageTypeRequest extends UdtRequest {

/**
 *
 * Constructor for ServPackageTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServPackageTypeRequest(String id, String method) {
    super(id, "ServPackageType", method);
  }
}
