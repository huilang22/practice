/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataLinkSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ItemMarketingDataLink related UdtSubRequestParents
 *
 */
public abstract class ItemMarketingDataLinkSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ItemMarketingDataLinkRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemMarketingDataLinkRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ItemMarketingDataLinkSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemMarketingDataLinkSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ItemMarketingDataLinkSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ItemMarketingDataLinkSubRequestParent(String id, String method) {
    super(id, "ItemMarketingDataLink", method);
  }
}
