/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdQueue related UdtRequests
 *
 */

public abstract class BsdQueueRequest extends UdtRequest {

/**
 *
 * Constructor for BsdQueueRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdQueueRequest(String id, String method) {
    super(id, "BsdQueue", method);
  }
}
