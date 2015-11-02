/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CitInteraction related UdtRequests
 *
 */

public abstract class CitInteractionRequest extends UdtRequest {

/**
 *
 * Constructor for CitInteractionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CitInteractionRequest(String id, String method) {
    super(id, "CitInteraction", method);
  }
}
