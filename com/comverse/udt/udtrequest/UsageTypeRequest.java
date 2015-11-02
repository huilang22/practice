/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UsageType related UdtRequests
 *
 */

public abstract class UsageTypeRequest extends UdtRequest {

/**
 *
 * Constructor for UsageTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UsageTypeRequest(String id, String method) {
    super(id, "UsageType", method);
  }
}
