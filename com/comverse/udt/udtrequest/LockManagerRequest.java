/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LockManagerRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all LockManager related UdtRequests
 *
 */

public abstract class LockManagerRequest extends UdtRequest {

/**
 *
 * Constructor for LockManagerRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public LockManagerRequest(String id, String method) {
    super(id, "LockManager", method);
  }
}
