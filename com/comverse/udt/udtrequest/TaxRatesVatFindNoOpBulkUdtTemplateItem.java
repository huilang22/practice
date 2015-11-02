/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxRatesVatFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TaxRatesVatFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TaxRatesVatFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TaxRatesVatObjectDataList noOpIn;

/**
 *
 * Constructor to create a   TaxRatesVatFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TaxRatesVatFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxRatesVatObjectDataList noOpInIn) {
    super(id, context, "TaxRatesVatFind");
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
        mapArray[i] = TaxRatesVatObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TaxRatesVat", noOpIn);
      }
      addInput("TaxRatesVat", mapList);
    }
  }
/**
 *
 * Sets the  TaxRatesVat
 * @param noOpInIn TaxRatesVatObjectDataList to set
 *
 */
  public void setTaxRatesVat(TaxRatesVatObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TaxRatesVat passed into the constructor
 * @return Simulated response
 *
 */
  public TaxRatesVatObjectDataList getTaxRatesVat() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TaxRatesVatObjectHelper.fromMapList(inputMap, "TaxRatesVatList");
  }
}
