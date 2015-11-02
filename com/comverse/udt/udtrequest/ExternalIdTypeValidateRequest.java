/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeValidateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ExternalIdTypeValidate related UdtRequests
 *
 */

public abstract class ExternalIdTypeValidateRequest extends UdtRequest {

/**
 *
 * Constructor for ExternalIdTypeValidateRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ExternalIdTypeValidateRequest(String id, String method) {
    super(id, "ExternalIdTypeValidate", method);
  }
}
