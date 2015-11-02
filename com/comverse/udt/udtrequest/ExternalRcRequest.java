/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalRcRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ExternalRc related UdtRequests
 *
 */

public abstract class ExternalRcRequest extends UdtRequest {

/**
 *
 * Constructor for ExternalRcRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ExternalRcRequest(String id, String method) {
    super(id, "ExternalRc", method);
  }
}
