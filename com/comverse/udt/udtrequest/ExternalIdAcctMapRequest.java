/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdAcctMapRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ExternalIdAcctMap related UdtRequests
 *
 */

public abstract class ExternalIdAcctMapRequest extends UdtRequest {

/**
 *
 * Constructor for ExternalIdAcctMapRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ExternalIdAcctMapRequest(String id, String method) {
    super(id, "ExternalIdAcctMap", method);
  }
}
