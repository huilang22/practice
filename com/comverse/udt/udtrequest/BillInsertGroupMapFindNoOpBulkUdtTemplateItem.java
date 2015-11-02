/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupMapFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillInsertGroupMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillInsertGroupMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillInsertGroupMapObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BillInsertGroupMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillInsertGroupMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInsertGroupMapObjectDataList noOpInIn) {
    super(id, context, "BillInsertGroupMapFind");
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
        mapArray[i] = BillInsertGroupMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillInsertGroupMap", noOpIn);
      }
      addInput("BillInsertGroupMap", mapList);
    }
  }
/**
 *
 * Sets the  BillInsertGroupMap
 * @param noOpInIn BillInsertGroupMapObjectDataList to set
 *
 */
  public void setBillInsertGroupMap(BillInsertGroupMapObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillInsertGroupMap passed into the constructor
 * @return Simulated response
 *
 */
  public BillInsertGroupMapObjectDataList getBillInsertGroupMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillInsertGroupMapObjectHelper.fromMapList(inputMap, "BillInsertGroupMapList");
  }
}
