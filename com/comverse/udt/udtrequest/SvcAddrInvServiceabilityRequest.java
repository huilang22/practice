/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcAddrInvServiceabilityRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all SvcAddrInvServiceability related UdtRequests
 *
 */

public abstract class SvcAddrInvServiceabilityRequest extends UdtRequest {

/**
 *
 * Constructor for SvcAddrInvServiceabilityRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SvcAddrInvServiceabilityRequest(String id, String method) {
    super(id, "SvcAddrInvServiceability", method);
  }
}
