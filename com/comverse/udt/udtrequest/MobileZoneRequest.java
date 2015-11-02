/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MobileZoneRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all MobileZone related UdtRequests
 *
 */

public abstract class MobileZoneRequest extends UdtRequest {

/**
 *
 * Constructor for MobileZoneRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public MobileZoneRequest(String id, String method) {
    super(id, "MobileZone", method);
  }
}
