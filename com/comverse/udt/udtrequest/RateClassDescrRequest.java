/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateClassDescrRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RateClassDescr related UdtRequests
 *
 */

public abstract class RateClassDescrRequest extends UdtRequest {

/**
 *
 * Constructor for RateClassDescrRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RateClassDescrRequest(String id, String method) {
    super(id, "RateClassDescr", method);
  }
}
