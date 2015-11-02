/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DescriptionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Description related UdtRequests
 *
 */

public abstract class DescriptionRequest extends UdtRequest {

/**
 *
 * Constructor for DescriptionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public DescriptionRequest(String id, String method) {
    super(id, "Description", method);
  }
}
