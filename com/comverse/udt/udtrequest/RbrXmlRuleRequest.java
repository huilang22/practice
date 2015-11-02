/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrXmlRuleRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RbrXmlRule related UdtRequests
 *
 */

public abstract class RbrXmlRuleRequest extends UdtRequest {

/**
 *
 * Constructor for RbrXmlRuleRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RbrXmlRuleRequest(String id, String method) {
    super(id, "RbrXmlRule", method);
  }
}
