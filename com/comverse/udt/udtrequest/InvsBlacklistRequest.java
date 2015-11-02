/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsBlacklistRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsBlacklist related UdtRequests
 *
 */

public abstract class InvsBlacklistRequest extends UdtRequest {

/**
 *
 * Constructor for InvsBlacklistRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsBlacklistRequest(String id, String method) {
    super(id, "InvsBlacklist", method);
  }
}
