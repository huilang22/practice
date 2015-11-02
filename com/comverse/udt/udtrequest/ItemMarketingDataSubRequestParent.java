/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataSubRequestParent.java
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
 * Abstract base class for all ItemMarketingData related UdtSubRequestParents
 *
 */
public abstract class ItemMarketingDataSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ItemMarketingDataRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemMarketingDataRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ItemMarketingDataSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemMarketingDataSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ItemMarketingDataSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ItemMarketingDataSubRequestParent(String id, String method) {
    super(id, "ItemMarketingData", method);
  }
}
