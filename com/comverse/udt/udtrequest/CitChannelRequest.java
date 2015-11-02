/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitChannelRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CitChannel related UdtRequests
 *
 */

public abstract class CitChannelRequest extends UdtRequest {

/**
 *
 * Constructor for CitChannelRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CitChannelRequest(String id, String method) {
    super(id, "CitChannel", method);
  }
}
