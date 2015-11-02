/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageJurisdictionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UsageJurisdiction related UdtRequests
 *
 */

public abstract class UsageJurisdictionRequest extends UdtRequest {

/**
 *
 * Constructor for UsageJurisdictionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UsageJurisdictionRequest(String id, String method) {
    super(id, "UsageJurisdiction", method);
  }
}
