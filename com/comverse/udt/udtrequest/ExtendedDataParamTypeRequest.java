/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ExtendedDataParamType related UdtRequests
 *
 */

public abstract class ExtendedDataParamTypeRequest extends UdtRequest {

/**
 *
 * Constructor for ExtendedDataParamTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ExtendedDataParamTypeRequest(String id, String method) {
    super(id, "ExtendedDataParamType", method);
  }
}
