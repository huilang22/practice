/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CountryCodeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CountryCode related UdtRequests
 *
 */

public abstract class CountryCodeRequest extends UdtRequest {

/**
 *
 * Constructor for CountryCodeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CountryCodeRequest(String id, String method) {
    super(id, "CountryCode", method);
  }
}
