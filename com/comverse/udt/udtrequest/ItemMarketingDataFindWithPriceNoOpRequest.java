/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataFindWithPriceNoOpRequest.java
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
 * NoOp class used to simulate a ItemMarketingDataFindWithPriceNoOpRequest Udt Request/Response
 *
 */
public class ItemMarketingDataFindWithPriceNoOpRequest extends ItemMarketingDataRequest {
/**
 *
 * Constructor to create a   ItemMarketingDataFindWithPriceNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemMarketingDataFindWithPriceNoOpRequest(String id, ItemMarketingDataWithPriceObjectDataList noOpIn) {
    super(id, "ItemMarketingDataFindWithPriceNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ItemMarketingDataWithPriceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemMarketingData", noOpIn);
      }
      addInput("ItemMarketingData", mapList);
    }
  }
/**
 *
 * Retrieves the ItemMarketingDataWithPriceObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ItemMarketingDataWithPriceObjectDataList getOutput() {
    return ItemMarketingDataWithPriceObjectHelper.fromMapList(outputMap, "ItemMarketingDataList");
  }
}
