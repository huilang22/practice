/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferSummaryFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferSummaryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferSummaryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferSummaryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcOfferSummaryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferSummaryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferSummaryObjectDataList noOpInIn) {
    super(id, context, "CtcOfferSummaryFind");
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
        mapArray[i] = CtcOfferSummaryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcOffer", noOpIn);
      }
      addInput("CtcOffer", mapList);
    }
  }
/**
 *
 * Sets the  CtcOffer
 * @param noOpInIn CtcOfferSummaryObjectDataList to set
 *
 */
  public void setCtcOffer(CtcOfferSummaryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOffer passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferSummaryObjectDataList getCtcOffer() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferSummaryObjectHelper.fromMapList(inputMap, "CtcOfferList");
  }
}
