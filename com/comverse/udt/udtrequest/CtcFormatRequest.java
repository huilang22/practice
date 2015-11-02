/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcFormat related UdtRequests
 *
 */

public abstract class CtcFormatRequest extends UdtRequest {

/**
 *
 * Constructor for CtcFormatRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcFormatRequest(String id, String method) {
    super(id, "CtcFormat", method);
  }
}
