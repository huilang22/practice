/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxAssignmentRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all TaxAssignment related UdtRequests
 *
 */

public abstract class TaxAssignmentRequest extends UdtRequest {

/**
 *
 * Constructor for TaxAssignmentRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public TaxAssignmentRequest(String id, String method) {
    super(id, "TaxAssignment", method);
  }
}
