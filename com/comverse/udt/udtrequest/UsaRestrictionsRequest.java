/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsaRestrictionsRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UsaRestrictions related UdtRequests
 *
 */

public abstract class UsaRestrictionsRequest extends UdtRequest {

/**
 *
 * Constructor for UsaRestrictionsRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UsaRestrictionsRequest(String id, String method) {
    super(id, "UsaRestrictions", method);
  }
}
