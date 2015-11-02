/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtPaymentProfileFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AxrtPaymentProfileFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AxrtPaymentProfileFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AxrtPaymentProfileObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AxrtPaymentProfileFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AxrtPaymentProfileFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtPaymentProfileObjectDataList noOpInIn) {
    super(id, context, "AxrtPaymentProfileFind");
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
        mapArray[i] = AxrtPaymentProfileObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AxrtPaymentProfile", noOpIn);
      }
      addInput("AxrtPaymentProfile", mapList);
    }
  }
/**
 *
 * Sets the  AxrtPaymentProfile
 * @param noOpInIn AxrtPaymentProfileObjectDataList to set
 *
 */
  public void setAxrtPaymentProfile(AxrtPaymentProfileObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AxrtPaymentProfile passed into the constructor
 * @return Simulated response
 *
 */
  public AxrtPaymentProfileObjectDataList getAxrtPaymentProfile() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AxrtPaymentProfileObjectHelper.fromMapList(inputMap, "AxrtPaymentProfileList");
  }
}
