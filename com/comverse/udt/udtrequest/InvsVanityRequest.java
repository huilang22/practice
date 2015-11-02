/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVanityRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsVanity related UdtRequests
 *
 */

public abstract class InvsVanityRequest extends UdtRequest {

/**
 *
 * Constructor for InvsVanityRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsVanityRequest(String id, String method) {
    super(id, "InvsVanity", method);
  }
}
