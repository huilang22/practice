/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeAssocFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ItemTypeAssocFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemTypeAssocFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemTypeAssocObjDataList noOpIn;

/**
 *
 * Constructor to create a   ItemTypeAssocFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemTypeAssocFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemTypeAssocObjDataList noOpInIn) {
    super(id, context, "ItemTypeAssocFind");
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
        mapArray[i] = ItemTypeAssocObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemTypeAssoc", noOpIn);
      }
      addInput("ItemTypeAssoc", mapList);
    }
  }
/**
 *
 * Sets the  ItemTypeAssoc
 * @param noOpInIn ItemTypeAssocObjDataList to set
 *
 */
  public void setItemTypeAssoc(ItemTypeAssocObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemTypeAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public ItemTypeAssocObjDataList getItemTypeAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemTypeAssocObjHelper.fromMapList(inputMap, "ItemTypeAssocList");
  }
}
