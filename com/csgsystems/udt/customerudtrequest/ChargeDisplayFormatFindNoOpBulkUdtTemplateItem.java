/*
 * Generated code DO NOT EDIT
 * Generated file: ChargeDisplayFormatFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ChargeDisplayFormatFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ChargeDisplayFormatFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ChargeDisplayFormatObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ChargeDisplayFormatFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ChargeDisplayFormatFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ChargeDisplayFormatObjectDataList noOpInIn) {
    super(id, context, "ChargeDisplayFormatFind");
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
        mapArray[i] = ChargeDisplayFormatObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ChargeDisplayFormat", noOpIn);
      }
      addInput("ChargeDisplayFormat", mapList);
    }
  }
/**
 *
 * Sets the  ChargeDisplayFormat
 * @param noOpInIn ChargeDisplayFormatObjectDataList to set
 *
 */
  public void setChargeDisplayFormat(ChargeDisplayFormatObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ChargeDisplayFormat passed into the constructor
 * @return Simulated response
 *
 */
  public ChargeDisplayFormatObjectDataList getChargeDisplayFormat() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ChargeDisplayFormatObjectHelper.fromMapList(inputMap, "ChargeDisplayFormatList");
  }
}
