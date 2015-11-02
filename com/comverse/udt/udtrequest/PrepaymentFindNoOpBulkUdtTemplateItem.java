/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PrepaymentFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PrepaymentFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PrepaymentObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PrepaymentFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PrepaymentFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PrepaymentObjectDataList noOpInIn) {
    super(id, context, "PrepaymentFind");
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
        mapArray[i] = PrepaymentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Prepayment", noOpIn);
      }
      addInput("Prepayment", mapList);
    }
  }
/**
 *
 * Sets the  Prepayment
 * @param noOpInIn PrepaymentObjectDataList to set
 *
 */
  public void setPrepayment(PrepaymentObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Prepayment passed into the constructor
 * @return Simulated response
 *
 */
  public PrepaymentObjectDataList getPrepayment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PrepaymentObjectHelper.fromMapList(inputMap, "PrepaymentList");
  }
}
