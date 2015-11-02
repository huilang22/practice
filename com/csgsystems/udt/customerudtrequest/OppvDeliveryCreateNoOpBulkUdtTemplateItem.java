/*
 * Generated code DO NOT EDIT
 * Generated file: OppvDeliveryCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OppvDeliveryCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OppvDeliveryCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OppvDeliveryObjData noOpIn;

/**
 *
 * Constructor to create a   OppvDeliveryCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OppvDeliveryCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OppvDeliveryObjData noOpInIn) {
    super(id, context, "OppvDeliveryCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OppvDelivery", OppvDeliveryObjHelper.toMap(noOpIn, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }
/**
 *
 * Sets the  OppvDelivery
 * @param noOpInIn OppvDeliveryObjData to set
 *
 */
  public void setOppvDelivery(OppvDeliveryObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OppvDelivery passed into the constructor
 * @return Simulated response
 *
 */
  public OppvDeliveryObjData getOppvDelivery() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OppvDeliveryObjHelper.fromMap(inputMap, "OppvDelivery");
  }
}
