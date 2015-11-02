/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintDescriptionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdConstraintDescription related UdtRequests
 *
 */

public abstract class BsdConstraintDescriptionRequest extends UdtRequest {

/**
 *
 * Constructor for BsdConstraintDescriptionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdConstraintDescriptionRequest(String id, String method) {
    super(id, "BsdConstraintDescription", method);
  }
}
