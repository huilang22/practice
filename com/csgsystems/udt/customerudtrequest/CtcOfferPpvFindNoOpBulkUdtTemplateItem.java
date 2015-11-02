/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferPpvFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferPpvFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferPpvFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcOfferPpvFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferPpvFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferObjectDataList noOpInIn) {
    super(id, context, "CtcOfferPpvFind");
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
        mapArray[i] = CtcOfferObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcOffer", noOpIn);
      }
      addInput("CtcOffer", mapList);
    }
  }
/**
 *
 * Sets the  CtcOffer
 * @param noOpInIn CtcOfferObjectDataList to set
 *
 */
  public void setCtcOffer(CtcOfferObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOffer passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferObjectDataList getCtcOffer() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferObjectHelper.fromMapList(inputMap, "CtcOfferList");
  }
}
