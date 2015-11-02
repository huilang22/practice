/*
 * Generated code DO NOT EDIT
 * Generated file: BillingFrequencyFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a BillingFrequencyFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillingFrequencyFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BFObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BillingFrequencyFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillingFrequencyFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BFObjectDataList noOpInIn) {
    super(id, context, "BillingFrequencyFind");
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
        mapArray[i] = BFObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillingFrequency", noOpIn);
      }
      addInput("BillingFrequency", mapList);
    }
  }
/**
 *
 * Sets the  BillingFrequency
 * @param noOpInIn BFObjectDataList to set
 *
 */
  public void setBillingFrequency(BFObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillingFrequency passed into the constructor
 * @return Simulated response
 *
 */
  public BFObjectDataList getBillingFrequency() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BFObjectHelper.fromMapList(inputMap, "BillingFrequencyList");
  }
}
