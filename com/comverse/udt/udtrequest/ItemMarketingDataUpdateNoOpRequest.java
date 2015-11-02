/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ItemMarketingDataUpdateNoOpRequest Udt Request/Response
 *
 */
public class ItemMarketingDataUpdateNoOpRequest extends ItemMarketingDataSubRequestParent {
/**
 *
 * Constructor to create a   ItemMarketingDataUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemMarketingDataUpdateNoOpRequest(String id, ItemMarketingDataObjectData noOpIn) {
    super(id, "ItemMarketingDataUpdateNoOpRequest");
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
