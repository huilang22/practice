/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ItemMarketingData related UdtRequests
 *
 */

public abstract class ItemMarketingDataRequest extends UdtRequest {

/**
 *
 * Constructor for ItemMarketingDataRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ItemMarketingDataRequest(String id, String method) {
    super(id, "ItemMarketingData", method);
  }
}
