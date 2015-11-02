/*
 * Generated code DO NOT EDIT
 * Generated file: InvsStockPropConfigCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsStockPropConfigCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsStockPropConfigCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsStockPropConfigObjectData InvsStockPropConfigCreateIn;
/**
 *
 * Constructor to create a  InvsStockPropConfigCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsStockPropConfigCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStockPropConfigObjectData InvsStockPropConfigCreateInIn) {
    super(id, context, "InvsStockPropConfigCreate");
    InvsStockPropConfigCreateIn = InvsStockPropConfigCreateInIn;
  }

  public void translateToMap() {
    if (InvsStockPropConfigCreateIn != null) {
      InvsStockPropConfigCreateIn.resetFlags(true, true);
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectHelper.toMap(InvsStockPropConfigCreateIn, new HashMap(), "InvsStockPropConfig").get("InvsStockPropConfig"));
    }
  }


/**
 *
 * Sets the InvsStockPropConfig
 * @param InvsStockPropConfigCreateInIn Value of the InvsStockPropConfigCreateIn
 *
 */

  public void setInvsStockPropConfig(InvsStockPropConfigObjectData InvsStockPropConfigCreateInIn) {
    InvsStockPropConfigCreateIn = InvsStockPropConfigCreateInIn;
  }

  public void translateFromMap() {
    InvsStockPropConfigCreateIn = InvsStockPropConfigObjectHelper.fromMap(inputMap, "InvsStockPropConfig");
  }

/**
 *
 * Gets the InvsStockPropConfig
 * @return Value of the InvsStockPropConfig
 *
 */

  public InvsStockPropConfigObjectData getInvsStockPropConfig( ) {
    return InvsStockPropConfigCreateIn;
  }

}
