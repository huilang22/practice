/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointTransTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BonusPointTransType related UdtRequests
 *
 */

public abstract class BonusPointTransTypeRequest extends UdtRequest {

/**
 *
 * Constructor for BonusPointTransTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BonusPointTransTypeRequest(String id, String method) {
    super(id, "BonusPointTransType", method);
  }
}
