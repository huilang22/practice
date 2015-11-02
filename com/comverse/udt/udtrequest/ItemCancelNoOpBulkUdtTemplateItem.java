/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCancelNoOpBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ItemCancelNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemCancelNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ItemCancelNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemCancelNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemObjectDataList noOpInIn) {
    super(id, context, "ItemCancel");
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
        mapArray[i] = ItemObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Item", noOpIn);
      }
      addInput("Item", mapList);
    }
  }
/**
 *
 * Sets the  Item
 * @param noOpInIn ItemObjectDataList to set
 *
 */
  public void setItem(ItemObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Item passed into the constructor
 * @return Simulated response
 *
 */
  public ItemObjectDataList getItem() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemObjectHelper.fromMapList(inputMap, "ItemList");
  }
}
