/*
 * Generated code DO NOT EDIT
 * Generated file: ClassOfServiceCodeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ClassOfServiceCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ClassOfServiceCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected COSCObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ClassOfServiceCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ClassOfServiceCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, COSCObjectDataList noOpInIn) {
    super(id, context, "ClassOfServiceCodeFind");
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
        mapArray[i] = COSCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ClassOfServiceCode", noOpIn);
      }
      addInput("ClassOfServiceCode", mapList);
    }
  }
/**
 *
 * Sets the  ClassOfServiceCode
 * @param noOpInIn COSCObjectDataList to set
 *
 */
  public void setClassOfServiceCode(COSCObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ClassOfServiceCode passed into the constructor
 * @return Simulated response
 *
 */
  public COSCObjectDataList getClassOfServiceCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = COSCObjectHelper.fromMapList(inputMap, "ClassOfServiceCodeList");
  }
}
