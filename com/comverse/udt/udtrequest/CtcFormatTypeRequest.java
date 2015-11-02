/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcFormatType related UdtRequests
 *
 */

public abstract class CtcFormatTypeRequest extends UdtRequest {

/**
 *
 * Constructor for CtcFormatTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcFormatTypeRequest(String id, String method) {
    super(id, "CtcFormatType", method);
  }
}
