/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvServiceRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all PpvService related UdtRequests
 *
 */

public abstract class PpvServiceRequest extends UdtRequest {

/**
 *
 * Constructor for PpvServiceRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public PpvServiceRequest(String id, String method) {
    super(id, "PpvService", method);
  }
}
