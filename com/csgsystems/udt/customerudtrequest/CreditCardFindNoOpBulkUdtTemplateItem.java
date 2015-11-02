/*
 * Generated code DO NOT EDIT
 * Generated file: CreditCardFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CreditCardFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CreditCardFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CreditCardObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CreditCardFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CreditCardFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CreditCardObjectDataList noOpInIn) {
    super(id, context, "CreditCardFind");
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
        mapArray[i] = CreditCardObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CreditCard", noOpIn);
      }
      addInput("CreditCard", mapList);
    }
  }
/**
 *
 * Sets the  CreditCard
 * @param noOpInIn CreditCardObjectDataList to set
 *
 */
  public void setCreditCard(CreditCardObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CreditCard passed into the constructor
 * @return Simulated response
 *
 */
  public CreditCardObjectDataList getCreditCard() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CreditCardObjectHelper.fromMapList(inputMap, "CreditCardList");
  }
}
