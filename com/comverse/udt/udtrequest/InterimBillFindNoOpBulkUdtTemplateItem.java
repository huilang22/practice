/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InterimBillFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InterimBillFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InterimBillObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InterimBillFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InterimBillFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InterimBillObjectDataList noOpInIn) {
    super(id, context, "InterimBillFind");
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
        mapArray[i] = InterimBillObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InterimBill", noOpIn);
      }
      addInput("InterimBill", mapList);
    }
  }
/**
 *
 * Sets the  InterimBill
 * @param noOpInIn InterimBillObjectDataList to set
 *
 */
  public void setInterimBill(InterimBillObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InterimBill passed into the constructor
 * @return Simulated response
 *
 */
  public InterimBillObjectDataList getInterimBill() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InterimBillObjectHelper.fromMapList(inputMap, "InterimBillList");
  }
}
