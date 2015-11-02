/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ExtendedDataParam related UdtRequests
 *
 */

public abstract class ExtendedDataParamRequest extends UdtRequest {

/**
 *
 * Constructor for ExtendedDataParamRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ExtendedDataParamRequest(String id, String method) {
    super(id, "ExtendedDataParam", method);
  }
}
