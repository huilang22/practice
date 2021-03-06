/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AccountSegment related UdtRequests
 *
 */

public abstract class AccountSegmentRequest extends UdtRequest {

/**
 *
 * Constructor for AccountSegmentRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AccountSegmentRequest(String id, String method) {
    super(id, "AccountSegment", method);
  }
}
