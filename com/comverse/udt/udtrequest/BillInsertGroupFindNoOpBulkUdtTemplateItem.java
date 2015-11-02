/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillInsertGroupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillInsertGroupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillInsertGroupObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BillInsertGroupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillInsertGroupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInsertGroupObjectDataList noOpInIn) {
    super(id, context, "BillInsertGroupFind");
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
        mapArray[i] = BillInsertGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillInsertGroup", noOpIn);
      }
      addInput("BillInsertGroup", mapList);
    }
  }
/**
 *
 * Sets the  BillInsertGroup
 * @param noOpInIn BillInsertGroupObjectDataList to set
 *
 */
  public void setBillInsertGroup(BillInsertGroupObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillInsertGroup passed into the constructor
 * @return Simulated response
 *
 */
  public BillInsertGroupObjectDataList getBillInsertGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillInsertGroupObjectHelper.fromMapList(inputMap, "BillInsertGroupList");
  }
}
