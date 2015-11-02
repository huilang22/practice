/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataGetNoOpRequest.java
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
 * NoOp class used to simulate a ItemMarketingDataGetNoOpRequest Udt Request/Response
 *
 */
public class ItemMarketingDataGetNoOpRequest extends ItemMarketingDataSubRequestParent {
/**
 *
 * Constructor to create a   ItemMarketingDataGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemMarketingDataGetNoOpRequest(String id, ItemMarketingDataObjectData noOpIn) {
    super(id, "ItemMarketingDataGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectHelper.toMap(noOpIn, new HashMap(), "ItemMarketingData").get("ItemMarketingData"));
    }
  }
/**
 *
 * Retrieves the ItemMarketingDataObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ItemMarketingDataObjectData getOutput() {
    return ItemMarketingDataObjectHelper.fromMap(outputMap, "ItemMarketingData");
  }
}
