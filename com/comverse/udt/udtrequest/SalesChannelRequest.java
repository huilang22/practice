/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SalesChannelRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all SalesChannel related UdtRequests
 *
 */

public abstract class SalesChannelRequest extends UdtRequest {

/**
 *
 * Constructor for SalesChannelRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SalesChannelRequest(String id, String method) {
    super(id, "SalesChannel", method);
  }
}
