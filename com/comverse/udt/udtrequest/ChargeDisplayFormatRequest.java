/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDisplayFormatRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ChargeDisplayFormat related UdtRequests
 *
 */

public abstract class ChargeDisplayFormatRequest extends UdtRequest {

/**
 *
 * Constructor for ChargeDisplayFormatRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ChargeDisplayFormatRequest(String id, String method) {
    super(id, "ChargeDisplayFormat", method);
  }
}
