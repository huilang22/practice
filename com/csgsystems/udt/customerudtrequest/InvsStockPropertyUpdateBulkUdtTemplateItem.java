/*
 * Generated code DO NOT EDIT
 * Generated file: InvsStockPropertyUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsStockPropertyUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsStockPropertyUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsStockPropertyObjectData InvsStockPropertyUpdateIn;
/**
 *
 * Constructor to create a  InvsStockPropertyUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsStockPropertyUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStockPropertyObjectData InvsStockPropertyUpdateInIn) {
    super(id, context, "InvsStockPropertyUpdate");
    InvsStockPropertyUpdateIn = InvsStockPropertyUpdateInIn;
  }

  public void translateToMap() {
    if (InvsStockPropertyUpdateIn != null) {
      InvsStockPropertyUpdateIn.resetFlags(true, true);
      addInput("InvsStockProperty", InvsStockPropertyObjectHelper.toMap(InvsStockPropertyUpdateIn, new HashMap(), "InvsStockProperty").get("InvsStockProperty"));
    }
  }


/**
 *
 * Sets the InvsStockProperty
 * @param InvsStockPropertyUpdateInIn Value of the InvsStockPropertyUpdateIn
 *
 */

  public void setInvsStockProperty(InvsStockPropertyObjectData InvsStockPropertyUpdateInIn) {
    InvsStockPropertyUpdateIn = InvsStockPropertyUpdateInIn;
  }

  public void translateFromMap() {
    InvsStockPropertyUpdateIn = InvsStockPropertyObjectHelper.fromMap(inputMap, "InvsStockProperty");
  }

/**
 *
 * Gets the InvsStockProperty
 * @return Value of the InvsStockProperty
 *
 */

  public InvsStockPropertyObjectData getInvsStockProperty( ) {
    return InvsStockPropertyUpdateIn;
  }

}
