/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimeGroupRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RbrTimeGroup related UdtRequests
 *
 */

public abstract class RbrTimeGroupRequest extends UdtRequest {

/**
 *
 * Constructor for RbrTimeGroupRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RbrTimeGroupRequest(String id, String method) {
    super(id, "RbrTimeGroup", method);
  }
}
