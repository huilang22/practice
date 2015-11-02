/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeValidateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ContractTypeValidate related UdtRequests
 *
 */

public abstract class ContractTypeValidateRequest extends UdtRequest {

/**
 *
 * Constructor for ContractTypeValidateRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ContractTypeValidateRequest(String id, String method) {
    super(id, "ContractTypeValidate", method);
  }
}
