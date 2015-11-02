/*
 * Generated code DO NOT EDIT
 * Generated file: OppvDeliveryFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a OppvDeliveryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OppvDeliveryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OppvDeliveryExtObjDataList noOpIn;

/**
 *
 * Constructor to create a   OppvDeliveryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OppvDeliveryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OppvDeliveryExtObjDataList noOpInIn) {
    super(id, context, "OppvDeliveryFind");
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
        mapArray[i] = OppvDeliveryExtObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OppvDelivery", noOpIn);
      }
      addInput("OppvDelivery", mapList);
    }
  }
/**
 *
 * Sets the  OppvDelivery
 * @param noOpInIn OppvDeliveryExtObjDataList to set
 *
 */
  public void setOppvDelivery(OppvDeliveryExtObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OppvDelivery passed into the constructor
 * @return Simulated response
 *
 */
  public OppvDeliveryExtObjDataList getOppvDelivery() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OppvDeliveryExtObjHelper.fromMapList(inputMap, "OppvDeliveryList");
  }
}
