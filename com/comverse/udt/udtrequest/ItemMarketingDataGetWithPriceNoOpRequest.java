/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataGetWithPriceNoOpRequest.java
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
 * NoOp class used to simulate a ItemMarketingDataGetWithPriceNoOpRequest Udt Request/Response
 *
 */
public class ItemMarketingDataGetWithPriceNoOpRequest extends ItemMarketingDataSubRequestParent {
/**
 *
 * Constructor to create a   ItemMarketingDataGetWithPriceNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemMarketingDataGetWithPriceNoOpRequest(String id, ItemMarketingDataWithPriceObjectData noOpIn) {
    super(id, "ItemMarketingDataGetWithPriceNoOpRequest");
    if (noOpIn != null) {
      addInput("ItemMarketingData", ItemMarketingDataWithPriceObjectHelper.toMap(noOpIn, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }
/**
 *
 * Retrieves the ItemMarketingDataWithPriceObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ItemMarketingDataWithPriceObjectData getOutput() {
    return ItemMarketingDataWithPriceObjectHelper.fromMap(outputMap, "ItemMarketingData");
  }
}
