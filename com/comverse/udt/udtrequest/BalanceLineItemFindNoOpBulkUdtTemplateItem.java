/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a BalanceLineItemFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BalanceLineItemFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BalanceLineItemObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BalanceLineItemFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BalanceLineItemFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BalanceLineItemObjectDataList noOpInIn) {
    super(id, context, "BalanceLineItemFind");
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
        mapArray[i] = BalanceLineItemObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BalanceLineItem", noOpIn);
      }
      addInput("BalanceLineItem", mapList);
    }
  }
/**
 *
 * Sets the  BalanceLineItem
 * @param noOpInIn BalanceLineItemObjectDataList to set
 *
 */
  public void setBalanceLineItem(BalanceLineItemObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BalanceLineItem passed into the constructor
 * @return Simulated response
 *
 */
  public BalanceLineItemObjectDataList getBalanceLineItem() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BalanceLineItemObjectHelper.fromMapList(inputMap, "BalanceLineItemList");
  }
}
