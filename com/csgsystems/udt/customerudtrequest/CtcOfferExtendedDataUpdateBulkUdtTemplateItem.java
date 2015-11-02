/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferExtendedDataUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferExtendedDataUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferExtendedDataUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferExtendedDataObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcOfferExtendedDataUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferExtendedDataUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferExtendedDataObjectData UpdateInIn) {
    super(id, context, "CtcOfferExtendedDataUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectHelper.toMap(UpdateIn, new HashMap(), "CtcOfferExtendedData").get("CtcOfferExtendedData"));
    }
  }


/**
 *
 * Sets the CtcOfferExtendedData
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcOfferExtendedData(CtcOfferExtendedDataObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcOfferExtendedDataObjectHelper.fromMap(inputMap, "CtcOfferExtendedData");
  }

/**
 *
 * Gets the CtcOfferExtendedData
 * @return Value of the CtcOfferExtendedData
 *
 */

  public CtcOfferExtendedDataObjectData getCtcOfferExtendedData( ) {
    return UpdateIn;
  }

}
