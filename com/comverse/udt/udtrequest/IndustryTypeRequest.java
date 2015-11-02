/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * IndustryTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all IndustryType related UdtRequests
 *
 */

public abstract class IndustryTypeRequest extends UdtRequest {

/**
 *
 * Constructor for IndustryTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public IndustryTypeRequest(String id, String method) {
    super(id, "IndustryType", method);
  }
}
