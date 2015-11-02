/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ExternalIdType related UdtRequests
 *
 */

public abstract class ExternalIdTypeRequest extends UdtRequest {

/**
 *
 * Constructor for ExternalIdTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ExternalIdTypeRequest(String id, String method) {
    super(id, "ExternalIdType", method);
  }
}
