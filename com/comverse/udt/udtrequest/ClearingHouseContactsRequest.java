/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseContactsRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ClearingHouseContacts related UdtRequests
 *
 */

public abstract class ClearingHouseContactsRequest extends UdtRequest {

/**
 *
 * Constructor for ClearingHouseContactsRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ClearingHouseContactsRequest(String id, String method) {
    super(id, "ClearingHouseContacts", method);
  }
}
