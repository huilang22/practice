/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferBuyDetailFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferBuyDetailFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferBuyDetailFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferBuyDetailObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcOfferBuyDetailFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferBuyDetailFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyDetailObjectDataList noOpInIn) {
    super(id, context, "CtcOfferBuyDetailFind");
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
        mapArray[i] = CtcOfferBuyDetailObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcOfferBuy", noOpIn);
      }
      addInput("CtcOfferBuy", mapList);
    }
  }
/**
 *
 * Sets the  CtcOfferBuy
 * @param noOpInIn CtcOfferBuyDetailObjectDataList to set
 *
 */
  public void setCtcOfferBuy(CtcOfferBuyDetailObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOfferBuy passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferBuyDetailObjectDataList getCtcOfferBuy() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferBuyDetailObjectHelper.fromMapList(inputMap, "CtcOfferBuyList");
  }
}
