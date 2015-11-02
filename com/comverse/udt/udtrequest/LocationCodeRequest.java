/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all LocationCode related UdtRequests
 *
 */

public abstract class LocationCodeRequest extends UdtRequest {

/**
 *
 * Constructor for LocationCodeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public LocationCodeRequest(String id, String method) {
    super(id, "LocationCode", method);
  }
}
