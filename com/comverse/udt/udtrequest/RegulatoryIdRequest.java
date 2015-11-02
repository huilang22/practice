/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RegulatoryIdRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RegulatoryId related UdtRequests
 *
 */

public abstract class RegulatoryIdRequest extends UdtRequest {

/**
 *
 * Constructor for RegulatoryIdRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RegulatoryIdRequest(String id, String method) {
    super(id, "RegulatoryId", method);
  }
}
