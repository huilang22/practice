/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsCountryCodeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsCountryCode related UdtRequests
 *
 */

public abstract class InvsCountryCodeRequest extends UdtRequest {

/**
 *
 * Constructor for InvsCountryCodeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsCountryCodeRequest(String id, String method) {
    super(id, "InvsCountryCode", method);
  }
}
