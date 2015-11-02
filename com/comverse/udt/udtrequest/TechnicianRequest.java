/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TechnicianRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Technician related UdtRequests
 *
 */

public abstract class TechnicianRequest extends UdtRequest {

/**
 *
 * Constructor for TechnicianRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public TechnicianRequest(String id, String method) {
    super(id, "Technician", method);
  }
}
