/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitImportanceRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CitImportance related UdtRequests
 *
 */

public abstract class CitImportanceRequest extends UdtRequest {

/**
 *
 * Constructor for CitImportanceRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CitImportanceRequest(String id, String method) {
    super(id, "CitImportance", method);
  }
}
