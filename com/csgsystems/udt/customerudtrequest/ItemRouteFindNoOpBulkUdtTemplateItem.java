/*
 * Generated code DO NOT EDIT
 * Generated file: ItemRouteFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ItemRouteFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemRouteFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemRouteObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ItemRouteFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemRouteFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemRouteObjectDataList noOpInIn) {
    super(id, context, "ItemRouteFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = ItemRouteObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemRoute", noOpIn);
      }
      addInput("ItemRoute", mapList);
    }
  }
/**
 *
 * Sets the  ItemRoute
 * @param noOpInIn ItemRouteObjectDataList to set
 *
 */
  public void setItemRoute(ItemRouteObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemRoute passed into the constructor
 * @return Simulated response
 *
 */
  public ItemRouteObjectDataList getItemRoute() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemRouteObjectHelper.fromMapList(inputMap, "ItemRouteList");
  }
}
