/*
 * Generated code DO NOT EDIT
 * Generated file: LanguageCodeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LanguageCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LanguageCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LCObjectDataList noOpIn;

/**
 *
 * Constructor to create a   LanguageCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LanguageCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LCObjectDataList noOpInIn) {
    super(id, context, "LanguageCodeFind");
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
        mapArray[i] = LCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("LanguageCode", noOpIn);
      }
      addInput("LanguageCode", mapList);
    }
  }
/**
 *
 * Sets the  LanguageCode
 * @param noOpInIn LCObjectDataList to set
 *
 */
  public void setLanguageCode(LCObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LanguageCode passed into the constructor
 * @return Simulated response
 *
 */
  public LCObjectDataList getLanguageCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LCObjectHelper.fromMapList(inputMap, "LanguageCodeList");
  }
}
