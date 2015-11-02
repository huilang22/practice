/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ContractType related UdtRequests
 *
 */

public abstract class ContractTypeRequest extends UdtRequest {

/**
 *
 * Constructor for ContractTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ContractTypeRequest(String id, String method) {
    super(id, "ContractType", method);
  }
}
