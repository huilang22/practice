/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemExtendedDataRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcItemExtendedData related UdtRequests
 *
 */

public abstract class CtcItemExtendedDataRequest extends UdtRequest {

/**
 *
 * Constructor for CtcItemExtendedDataRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcItemExtendedDataRequest(String id, String method) {
    super(id, "CtcItemExtendedData", method);
  }
}
