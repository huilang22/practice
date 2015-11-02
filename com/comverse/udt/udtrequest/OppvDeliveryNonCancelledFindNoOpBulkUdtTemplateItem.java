/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryNonCancelledFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a OppvDeliveryNonCancelledFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OppvDeliveryNonCancelledFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OppvOrderItemObjDataList noOpIn;

/**
 *
 * Constructor to create a   OppvDeliveryNonCancelledFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OppvDeliveryNonCancelledFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OppvOrderItemObjDataList noOpInIn) {
    super(id, context, "OppvDeliveryNonCancelledFind");
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
        mapArray[i] = OppvOrderItemObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OppvDelivery", noOpIn);
      }
      addInput("OppvDelivery", mapList);
    }
  }
/**
 *
 * Sets the  OppvDelivery
 * @param noOpInIn OppvOrderItemObjDataList to set
 *
 */
  public void setOppvDelivery(OppvOrderItemObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OppvDelivery passed into the constructor
 * @return Simulated response
 *
 */
  public OppvOrderItemObjDataList getOppvDelivery() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OppvOrderItemObjHelper.fromMapList(inputMap, "OppvDeliveryList");
  }
}
