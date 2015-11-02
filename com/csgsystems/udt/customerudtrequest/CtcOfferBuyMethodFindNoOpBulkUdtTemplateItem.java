/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferBuyMethodFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferBuyMethodFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferBuyMethodFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferBuyMethodObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcOfferBuyMethodFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferBuyMethodFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyMethodObjectDataList noOpInIn) {
    super(id, context, "CtcOfferBuyMethodFind");
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
        mapArray[i] = CtcOfferBuyMethodObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcOfferBuyMethod", noOpIn);
      }
      addInput("CtcOfferBuyMethod", mapList);
    }
  }
/**
 *
 * Sets the  CtcOfferBuyMethod
 * @param noOpInIn CtcOfferBuyMethodObjectDataList to set
 *
 */
  public void setCtcOfferBuyMethod(CtcOfferBuyMethodObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOfferBuyMethod passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferBuyMethodObjectDataList getCtcOfferBuyMethod() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferBuyMethodObjectHelper.fromMapList(inputMap, "CtcOfferBuyMethodList");
  }
}
