/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataLinkRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ItemMarketingDataLink related UdtRequests
 *
 */

public abstract class ItemMarketingDataLinkRequest extends UdtRequest {

/**
 *
 * Constructor for ItemMarketingDataLinkRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ItemMarketingDataLinkRequest(String id, String method) {
    super(id, "ItemMarketingDataLink", method);
  }
}
