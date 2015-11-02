/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenderTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all GenderType related UdtRequests
 *
 */

public abstract class GenderTypeRequest extends UdtRequest {

/**
 *
 * Constructor for GenderTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public GenderTypeRequest(String id, String method) {
    super(id, "GenderType", method);
  }
}
