/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataLinkFindNoOpRequest.java
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
 * NoOp class used to simulate a ItemMarketingDataLinkFindNoOpRequest Udt Request/Response
 *
 */
public class ItemMarketingDataLinkFindNoOpRequest extends ItemMarketingDataLinkRequest {
/**
 *
 * Constructor to create a   ItemMarketingDataLinkFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemMarketingDataLinkFindNoOpRequest(String id, ItemMarketingDataLinkObjectDataList noOpIn) {
    super(id, "ItemMarketingDataLinkFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ItemMarketingDataLinkObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemMarketingDataLink", noOpIn);
      }
      addInput("ItemMarketingDataLink", mapList);
    }
  }
/**
 *
 * Retrieves the ItemMarketingDataLinkObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ItemMarketingDataLinkObjectDataList getOutput() {
    return ItemMarketingDataLinkObjectHelper.fromMapList(outputMap, "ItemMarketingDataLinkList");
  }
}
