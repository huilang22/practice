/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DepositFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DepositFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DepositObjectDataList noOpIn;

/**
 *
 * Constructor to create a   DepositFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DepositFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DepositObjectDataList noOpInIn) {
    super(id, context, "DepositFind");
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
        mapArray[i] = DepositObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Deposit", noOpIn);
      }
      addInput("Deposit", mapList);
    }
  }
/**
 *
 * Sets the  Deposit
 * @param noOpInIn DepositObjectDataList to set
 *
 */
  public void setDeposit(DepositObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Deposit passed into the constructor
 * @return Simulated response
 *
 */
  public DepositObjectDataList getDeposit() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DepositObjectHelper.fromMapList(inputMap, "DepositList");
  }
}
