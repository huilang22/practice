/*
 * Generated code DO NOT EDIT
 * Generated file: EftTransactionFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a EftTransactionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EftTransactionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EftTransactionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   EftTransactionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EftTransactionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EftTransactionObjectDataList noOpInIn) {
    super(id, context, "EftTransactionFind");
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
        mapArray[i] = EftTransactionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EftTransaction", noOpIn);
      }
      addInput("EftTransaction", mapList);
    }
  }
/**
 *
 * Sets the  EftTransaction
 * @param noOpInIn EftTransactionObjectDataList to set
 *
 */
  public void setEftTransaction(EftTransactionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EftTransaction passed into the constructor
 * @return Simulated response
 *
 */
  public EftTransactionObjectDataList getEftTransaction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EftTransactionObjectHelper.fromMapList(inputMap, "EftTransactionList");
  }
}
