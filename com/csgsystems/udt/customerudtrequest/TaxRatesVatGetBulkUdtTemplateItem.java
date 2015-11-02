/*
 * Generated code DO NOT EDIT
 * Generated file: TaxRatesVatGetBulkUdtTemplateItem.java
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
 * Class used to create a TaxRatesVatGetBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxRatesVatGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TaxRatesVatObjectKeyData TRVgetIn;
/**
 *
 * Constructor to create a  TaxRatesVatGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxRatesVatGetBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxRatesVatObjectKeyData TRVgetInIn) {
    super(id, context, "TaxRatesVatGet");
    TRVgetIn = TRVgetInIn;
  }

  public void translateToMap() {
    if (TRVgetIn != null) {
      TRVgetIn.resetFlags(true, true);
      addInput("TaxRatesVat", TaxRatesVatObjectKeyHelper.toMap(TRVgetIn, new HashMap(), "TaxRatesVatObjectKeyData").get("TaxRatesVatObjectKeyData"));
    }
  }


/**
 *
 * Sets the TaxRatesVat
 * @param TRVgetInIn Value of the TRVgetIn
 *
 */

  public void setTaxRatesVat(TaxRatesVatObjectKeyData TRVgetInIn) {
    TRVgetIn = TRVgetInIn;
  }

  public void translateFromMap() {
    TRVgetIn = TaxRatesVatObjectKeyHelper.fromMap(inputMap, "TaxRatesVat");
  }

/**
 *
 * Gets the TaxRatesVat
 * @return Value of the TaxRatesVat
 *
 */

  public TaxRatesVatObjectKeyData getTaxRatesVat( ) {
    return TRVgetIn;
  }

}
