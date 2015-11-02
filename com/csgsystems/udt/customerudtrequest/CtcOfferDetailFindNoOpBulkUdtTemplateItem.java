/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferDetailFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferDetailFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferDetailFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferDetailObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcOfferDetailFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferDetailFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferDetailObjectDataList noOpInIn) {
    super(id, context, "CtcOfferDetailFind");
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
        mapArray[i] = CtcOfferDetailObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcOffer", noOpIn);
      }
      addInput("CtcOffer", mapList);
    }
  }
/**
 *
 * Sets the  CtcOffer
 * @param noOpInIn CtcOfferDetailObjectDataList to set
 *
 */
  public void setCtcOffer(CtcOfferDetailObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOffer passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferDetailObjectDataList getCtcOffer() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferDetailObjectHelper.fromMapList(inputMap, "CtcOfferList");
  }
}
