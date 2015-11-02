/*
 * Generated code DO NOT EDIT
 * Generated file: OppvDeliveryGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OppvDeliveryGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OppvDeliveryGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OppvDeliveryExtObjData noOpIn;

/**
 *
 * Constructor to create a   OppvDeliveryGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OppvDeliveryGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OppvDeliveryExtObjData noOpInIn) {
    super(id, context, "OppvDeliveryGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OppvDelivery", OppvDeliveryExtObjHelper.toMap(noOpIn, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }
/**
 *
 * Sets the  OppvDelivery
 * @param noOpInIn OppvDeliveryExtObjData to set
 *
 */
  public void setOppvDelivery(OppvDeliveryExtObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OppvDelivery passed into the constructor
 * @return Simulated response
 *
 */
  public OppvDeliveryExtObjData getOppvDelivery() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OppvDeliveryExtObjHelper.fromMap(inputMap, "OppvDelivery");
  }
}
