/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProviderClassRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ProviderClass related UdtRequests
 *
 */

public abstract class ProviderClassRequest extends UdtRequest {

/**
 *
 * Constructor for ProviderClassRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ProviderClassRequest(String id, String method) {
    super(id, "ProviderClass", method);
  }
}
