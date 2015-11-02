/*
 * Generated code DO NOT EDIT
 * Generated file: InvsCountryCodeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsCountryCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsCountryCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsCountryCodeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsCountryCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsCountryCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsCountryCodeObjectDataList noOpInIn) {
    super(id, context, "InvsCountryCodeFind");
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
        mapArray[i] = InvsCountryCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsCountryCode", noOpIn);
      }
      addInput("InvsCountryCode", mapList);
    }
  }
/**
 *
 * Sets the  InvsCountryCode
 * @param noOpInIn InvsCountryCodeObjectDataList to set
 *
 */
  public void setInvsCountryCode(InvsCountryCodeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsCountryCode passed into the constructor
 * @return Simulated response
 *
 */
  public InvsCountryCodeObjectDataList getInvsCountryCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsCountryCodeObjectHelper.fromMapList(inputMap, "InvsCountryCodeList");
  }
}
