/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataFindNoOpRequest.java
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
 * NoOp class used to simulate a ItemMarketingDataFindNoOpRequest Udt Request/Response
 *
 */
public class ItemMarketingDataFindNoOpRequest extends ItemMarketingDataRequest {
/**
 *
 * Constructor to create a   ItemMarketingDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemMarketingDataFindNoOpRequest(String id, ItemMarketingDataObjectDataList noOpIn) {
    super(id, "ItemMarketingDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ItemMarketingDataObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemMarketingData", noOpIn);
      }
      addInput("ItemMarketingData", mapList);
    }
  }
/**
 *
 * Retrieves the ItemMarketingDataObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ItemMarketingDataObjectDataList getOutput() {
    return ItemMarketingDataObjectHelper.fromMapList(outputMap, "ItemMarketingDataList");
  }
}
