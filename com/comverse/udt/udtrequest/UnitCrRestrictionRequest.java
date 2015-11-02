/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRestrictionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UnitCrRestriction related UdtRequests
 *
 */

public abstract class UnitCrRestrictionRequest extends UdtRequest {

/**
 *
 * Constructor for UnitCrRestrictionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UnitCrRestrictionRequest(String id, String method) {
    super(id, "UnitCrRestriction", method);
  }
}
