/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcLineRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all NrcLine related UdtRequests
 *
 */

public abstract class NrcLineRequest extends UdtRequest {

/**
 *
 * Constructor for NrcLineRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public NrcLineRequest(String id, String method) {
    super(id, "NrcLine", method);
  }
}
