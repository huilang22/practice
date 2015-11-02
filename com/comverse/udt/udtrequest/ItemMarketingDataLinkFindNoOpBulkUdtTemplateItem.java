/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataLinkFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ItemMarketingDataLinkFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemMarketingDataLinkFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ItemMarketingDataLinkObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ItemMarketingDataLinkFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemMarketingDataLinkFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ItemMarketingDataLinkObjectDataList noOpInIn) {
    super(id, context, "ItemMarketingDataLinkFind");
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
        mapArray[i] = ItemMarketingDataLinkObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ItemMarketingDataLink", noOpIn);
      }
      addInput("ItemMarketingDataLink", mapList);
    }
  }
/**
 *
 * Sets the  ItemMarketingDataLink
 * @param noOpInIn ItemMarketingDataLinkObjectDataList to set
 *
 */
  public void setItemMarketingDataLink(ItemMarketingDataLinkObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ItemMarketingDataLink passed into the constructor
 * @return Simulated response
 *
 */
  public ItemMarketingDataLinkObjectDataList getItemMarketingDataLink() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ItemMarketingDataLinkObjectHelper.fromMapList(inputMap, "ItemMarketingDataLinkList");
  }
}
