/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferExtendedDataUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferExtendedDataUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferExtendedDataUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferExtendedDataObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcOfferExtendedDataUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferExtendedDataUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferExtendedDataObjectData noOpInIn) {
    super(id, context, "CtcOfferExtendedDataUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectHelper.toMap(noOpIn, new HashMap(), "CtcOfferExtendedData").get("CtcOfferExtendedData"));
    }
  }
/**
 *
 * Sets the  CtcOfferExtendedData
 * @param noOpInIn CtcOfferExtendedDataObjectData to set
 *
 */
  public void setCtcOfferExtendedData(CtcOfferExtendedDataObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOfferExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferExtendedDataObjectData getCtcOfferExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferExtendedDataObjectHelper.fromMap(inputMap, "CtcOfferExtendedData");
  }
}
