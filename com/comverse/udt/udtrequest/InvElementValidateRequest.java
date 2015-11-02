/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementValidateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvElementValidate related UdtRequests
 *
 */

public abstract class InvElementValidateRequest extends UdtRequest {

/**
 *
 * Constructor for InvElementValidateRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvElementValidateRequest(String id, String method) {
    super(id, "InvElementValidate", method);
  }
}
