/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationValuesRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsLocationValues related UdtRequests
 *
 */

public abstract class InvsLocationValuesRequest extends UdtRequest {

/**
 *
 * Constructor for InvsLocationValuesRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsLocationValuesRequest(String id, String method) {
    super(id, "InvsLocationValues", method);
  }
}
