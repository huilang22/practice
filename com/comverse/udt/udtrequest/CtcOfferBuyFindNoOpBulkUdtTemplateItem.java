/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyFindNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a CtcOfferBuyFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferBuyFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferBuyObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcOfferBuyFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferBuyFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyObjectDataList noOpInIn) {
    super(id, context, "CtcOfferBuyFind");
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
        mapArray[i] = CtcOfferBuyObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcOfferBuy", noOpIn);
      }
      addInput("CtcOfferBuy", mapList);
    }
  }
/**
 *
 * Sets the  CtcOfferBuy
 * @param noOpInIn CtcOfferBuyObjectDataList to set
 *
 */
  public void setCtcOfferBuy(CtcOfferBuyObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOfferBuy passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferBuyObjectDataList getCtcOfferBuy() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferBuyObjectHelper.fromMapList(inputMap, "CtcOfferBuyList");
  }
}
