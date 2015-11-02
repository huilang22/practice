/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryFindNoOpRequest.java
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
 * NoOp class used to simulate a ItemCategoryFindNoOpRequest Udt Request/Response
 *
 */
public class ItemCategoryFindNoOpRequest extends ItemCategoryRequest {
/**
 *
 * Constructor to create a   ItemCategoryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemCategoryFindNoOpRequest(String id, ItemCategoryObjectDataList noOpIn) {
    super(id, "ItemCategoryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ItemCategoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemCategory", noOpIn);
      }
      addInput("ItemCategory", mapList);
    }
  }
/**
 *
 * Retrieves the ItemCategoryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ItemCategoryObjectDataList getOutput() {
    return ItemCategoryObjectHelper.fromMapList(outputMap, "ItemCategoryList");
  }
}
