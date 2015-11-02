/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemActionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemActionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemActionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemActionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ItemActionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemActionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemActionObjectDataList noOpInIn) {
    super(id, context, "ItemActionFind");
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
        mapArray[i] = ItemActionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemAction", noOpIn);
      }
      addInput("ItemAction", mapList);
    }
  }
/**
 *
 * Sets the  ItemAction
 * @param noOpInIn ItemActionObjectDataList to set
 *
 */
  public void setItemAction(ItemActionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemAction passed into the constructor
 * @return Simulated response
 *
 */
  public ItemActionObjectDataList getItemAction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemActionObjectHelper.fromMapList(inputMap, "ItemActionList");
  }
}
