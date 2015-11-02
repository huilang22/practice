/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrUsageTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RbrUsageType related UdtRequests
 *
 */

public abstract class RbrUsageTypeRequest extends UdtRequest {

/**
 *
 * Constructor for RbrUsageTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RbrUsageTypeRequest(String id, String method) {
    super(id, "RbrUsageType", method);
  }
}
