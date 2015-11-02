/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeValidateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsTypeValidate related UdtRequests
 *
 */

public abstract class InvsTypeValidateRequest extends UdtRequest {

/**
 *
 * Constructor for InvsTypeValidateRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsTypeValidateRequest(String id, String method) {
    super(id, "InvsTypeValidate", method);
  }
}
