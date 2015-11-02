/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryMarketingAssociationFindNoOpRequest.java
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
 * NoOp class used to simulate a ItemCategoryMarketingAssociationFindNoOpRequest Udt Request/Response
 *
 */
public class ItemCategoryMarketingAssociationFindNoOpRequest extends ItemCategoryMarketingAssociationRequest {
/**
 *
 * Constructor to create a   ItemCategoryMarketingAssociationFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemCategoryMarketingAssociationFindNoOpRequest(String id, ItemCategoryMarketingObjectDataList noOpIn) {
    super(id, "ItemCategoryMarketingAssociationFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ItemCategoryMarketingObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemCategoryMarketingAssociation", noOpIn);
      }
      addInput("ItemCategoryMarketingAssociation", mapList);
    }
  }
/**
 *
 * Retrieves the ItemCategoryMarketingObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ItemCategoryMarketingObjectDataList getOutput() {
    return ItemCategoryMarketingObjectHelper.fromMapList(outputMap, "ItemCategoryMarketingAssociationList");
  }
}
