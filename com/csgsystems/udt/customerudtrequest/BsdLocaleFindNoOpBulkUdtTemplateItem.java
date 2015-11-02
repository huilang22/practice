/*
 * Generated code DO NOT EDIT
 * Generated file: BsdLocaleFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdLocaleFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdLocaleFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdLocaleObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdLocaleFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdLocaleFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdLocaleObjectDataList noOpInIn) {
    super(id, context, "BsdLocaleFind");
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
        mapArray[i] = BsdLocaleObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdLocale", noOpIn);
      }
      addInput("BsdLocale", mapList);
    }
  }
/**
 *
 * Sets the  BsdLocale
 * @param noOpInIn BsdLocaleObjectDataList to set
 *
 */
  public void setBsdLocale(BsdLocaleObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdLocale passed into the constructor
 * @return Simulated response
 *
 */
  public BsdLocaleObjectDataList getBsdLocale() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdLocaleObjectHelper.fromMapList(inputMap, "BsdLocaleList");
  }
}
