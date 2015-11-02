/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryIndustryAssociationFindNoOpRequest.java
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
 * NoOp class used to simulate a ItemCategoryIndustryAssociationFindNoOpRequest Udt Request/Response
 *
 */
public class ItemCategoryIndustryAssociationFindNoOpRequest extends ItemCategoryIndustryAssociationRequest {
/**
 *
 * Constructor to create a   ItemCategoryIndustryAssociationFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemCategoryIndustryAssociationFindNoOpRequest(String id, ItemCategoryIndustryObjectDataList noOpIn) {
    super(id, "ItemCategoryIndustryAssociationFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ItemCategoryIndustryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemCategoryIndustryAssociation", noOpIn);
      }
      addInput("ItemCategoryIndustryAssociation", mapList);
    }
  }
/**
 *
 * Retrieves the ItemCategoryIndustryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ItemCategoryIndustryObjectDataList getOutput() {
    return ItemCategoryIndustryObjectHelper.fromMapList(outputMap, "ItemCategoryIndustryAssociationList");
  }
}
