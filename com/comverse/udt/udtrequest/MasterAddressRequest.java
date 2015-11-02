/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all MasterAddress related UdtRequests
 *
 */

public abstract class MasterAddressRequest extends UdtRequest {

/**
 *
 * Constructor for MasterAddressRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public MasterAddressRequest(String id, String method) {
    super(id, "MasterAddress", method);
  }
}
