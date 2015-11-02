/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BusinessDayDefinition related UdtRequests
 *
 */

public abstract class BusinessDayDefinitionRequest extends UdtRequest {

/**
 *
 * Constructor for BusinessDayDefinitionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BusinessDayDefinitionRequest(String id, String method) {
    super(id, "BusinessDayDefinition", method);
  }
}
