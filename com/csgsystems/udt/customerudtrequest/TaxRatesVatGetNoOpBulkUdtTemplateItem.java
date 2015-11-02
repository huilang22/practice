/*
 * Generated code DO NOT EDIT
 * Generated file: TaxRatesVatGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a TaxRatesVatGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TaxRatesVatGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TaxRatesVatObjectData noOpIn;

/**
 *
 * Constructor to create a   TaxRatesVatGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TaxRatesVatGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxRatesVatObjectData noOpInIn) {
    super(id, context, "TaxRatesVatGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("TaxRatesVat", TaxRatesVatObjectHelper.toMap(noOpIn, new HashMap(), "TaxRatesVat").get("TaxRatesVat"));
    }
  }
/**
 *
 * Sets the  TaxRatesVat
 * @param noOpInIn TaxRatesVatObjectData to set
 *
 */
  public void setTaxRatesVat(TaxRatesVatObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TaxRatesVat passed into the constructor
 * @return Simulated response
 *
 */
  public TaxRatesVatObjectData getTaxRatesVat() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TaxRatesVatObjectHelper.fromMap(inputMap, "TaxRatesVat");
  }
}
