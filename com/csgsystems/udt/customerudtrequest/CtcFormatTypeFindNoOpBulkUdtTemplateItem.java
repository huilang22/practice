/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFormatTypeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcFormatTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcFormatTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcFormatTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcFormatTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcFormatTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFormatTypeObjectDataList noOpInIn) {
    super(id, context, "CtcFormatTypeFind");
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
        mapArray[i] = CtcFormatTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcFormatType", noOpIn);
      }
      addInput("CtcFormatType", mapList);
    }
  }
/**
 *
 * Sets the  CtcFormatType
 * @param noOpInIn CtcFormatTypeObjectDataList to set
 *
 */
  public void setCtcFormatType(CtcFormatTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcFormatType passed into the constructor
 * @return Simulated response
 *
 */
  public CtcFormatTypeObjectDataList getCtcFormatType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcFormatTypeObjectHelper.fromMapList(inputMap, "CtcFormatTypeList");
  }
}
