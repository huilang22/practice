/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentMapRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AccountSegmentMap related UdtRequests
 *
 */

public abstract class AccountSegmentMapRequest extends UdtRequest {

/**
 *
 * Constructor for AccountSegmentMapRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AccountSegmentMapRequest(String id, String method) {
    super(id, "AccountSegmentMap", method);
  }
}
