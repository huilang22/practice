/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtmParam related UdtRequests
 *
 */

public abstract class CtmParamRequest extends UdtRequest {

/**
 *
 * Constructor for CtmParamRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtmParamRequest(String id, String method) {
    super(id, "CtmParam", method);
  }
}
