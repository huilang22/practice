/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TimezoneRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Timezone related UdtRequests
 *
 */

public abstract class TimezoneRequest extends UdtRequest {

/**
 *
 * Constructor for TimezoneRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public TimezoneRequest(String id, String method) {
    super(id, "Timezone", method);
  }
}
