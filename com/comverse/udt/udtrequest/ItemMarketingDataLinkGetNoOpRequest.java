/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataLinkGetNoOpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ItemMarketingDataLinkGetNoOpRequest Udt Request/Response
 *
 */
public class ItemMarketingDataLinkGetNoOpRequest extends ItemMarketingDataLinkSubRequestParent {
/**
 *
 * Constructor to create a   ItemMarketingDataLinkGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemMarketingDataLinkGetNoOpRequest(String id, ItemMarketingDataLinkObjectData noOpIn) {
    super(id, "ItemMarketingDataLinkGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectHelper.toMap(noOpIn, new HashMap(), "ItemMarketingDataLink").get("ItemMarketingDataLink"));
    }
  }
/**
 *
 * Retrieves the ItemMarketingDataLinkObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ItemMarketingDataLinkObjectData getOutput() {
    return ItemMarketingDataLinkObjectHelper.fromMap(outputMap, "ItemMarketingDataLink");
  }
}
