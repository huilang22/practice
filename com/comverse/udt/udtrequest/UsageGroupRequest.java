/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageGroupRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UsageGroup related UdtRequests
 *
 */

public abstract class UsageGroupRequest extends UdtRequest {

/**
 *
 * Constructor for UsageGroupRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UsageGroupRequest(String id, String method) {
    super(id, "UsageGroup", method);
  }
}
