/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxRatesVatFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a TaxRatesVatFindBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxRatesVatFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TaxRatesVatObjectFilter TRVfindIn;
/**
 *
 * Constructor to create a  TaxRatesVatFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxRatesVatFindBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxRatesVatObjectFilter TRVfindInIn) {
    super(id, context, "TaxRatesVatFind");
    TRVfindIn = TRVfindInIn;
  }

  public void translateToMap() {
    if (TRVfindIn != null) {
      Integer index =  TRVfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TaxRatesVat", TaxRatesVatObjectHelper.toMap(TRVfindIn, new HashMap(), "TaxRatesVat").get("TaxRatesVat"));
    }
  }


/**
 *
 * Sets the TaxRatesVat
 * @param TRVfindInIn Value of the TRVfindIn
 *
 */

  public void setTaxRatesVat(TaxRatesVatObjectFilter TRVfindInIn) {
    TRVfindIn = TRVfindInIn;
  }

  public void translateFromMap() {
    TRVfindIn = TaxRatesVatObjectHelper.fromMapFilter(inputMap, "TaxRatesVat");
  }

/**
 *
 * Gets the TaxRatesVat
 * @return Value of the TaxRatesVat
 *
 */

  public TaxRatesVatObjectFilter getTaxRatesVat( ) {
    return TRVfindIn;
  }

}
