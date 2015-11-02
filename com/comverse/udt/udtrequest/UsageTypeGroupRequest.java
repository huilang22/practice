/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeGroupRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UsageTypeGroup related UdtRequests
 *
 */

public abstract class UsageTypeGroupRequest extends UdtRequest {

/**
 *
 * Constructor for UsageTypeGroupRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UsageTypeGroupRequest(String id, String method) {
    super(id, "UsageTypeGroup", method);
  }
}
