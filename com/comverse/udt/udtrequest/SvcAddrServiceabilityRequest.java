/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcAddrServiceabilityRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all SvcAddrServiceability related UdtRequests
 *
 */

public abstract class SvcAddrServiceabilityRequest extends UdtRequest {

/**
 *
 * Constructor for SvcAddrServiceabilityRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SvcAddrServiceabilityRequest(String id, String method) {
    super(id, "SvcAddrServiceability", method);
  }
}
