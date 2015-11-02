/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmDataRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtmData related UdtRequests
 *
 */

public abstract class CtmDataRequest extends UdtRequest {

/**
 *
 * Constructor for CtmDataRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtmDataRequest(String id, String method) {
    super(id, "CtmData", method);
  }
}
