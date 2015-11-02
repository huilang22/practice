/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ItemTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemTypeObjectDataList noOpInIn) {
    super(id, context, "ItemTypeFind");
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
        mapArray[i] = ItemTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemType", noOpIn);
      }
      addInput("ItemType", mapList);
    }
  }
/**
 *
 * Sets the  ItemType
 * @param noOpInIn ItemTypeObjectDataList to set
 *
 */
  public void setItemType(ItemTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemType passed into the constructor
 * @return Simulated response
 *
 */
  public ItemTypeObjectDataList getItemType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemTypeObjectHelper.fromMapList(inputMap, "ItemTypeList");
  }
}
