/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeSplitRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UsageTypeSplit related UdtRequests
 *
 */

public abstract class UsageTypeSplitRequest extends UdtRequest {

/**
 *
 * Constructor for UsageTypeSplitRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UsageTypeSplitRequest(String id, String method) {
    super(id, "UsageTypeSplit", method);
  }
}
