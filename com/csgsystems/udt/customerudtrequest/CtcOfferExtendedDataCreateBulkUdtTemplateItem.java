/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferExtendedDataCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferExtendedDataCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferExtendedDataCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferExtendedDataObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcOfferExtendedDataCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferExtendedDataCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferExtendedDataObjectData CreateInIn) {
    super(id, context, "CtcOfferExtendedDataCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectHelper.toMap(CreateIn, new HashMap(), "CtcOfferExtendedData").get("CtcOfferExtendedData"));
    }
  }


/**
 *
 * Sets the CtcOfferExtendedData
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcOfferExtendedData(CtcOfferExtendedDataObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcOfferExtendedDataObjectHelper.fromMap(inputMap, "CtcOfferExtendedData");
  }

/**
 *
 * Gets the CtcOfferExtendedData
 * @return Value of the CtcOfferExtendedData
 *
 */

  public CtcOfferExtendedDataObjectData getCtcOfferExtendedData( ) {
    return CreateIn;
  }

}
