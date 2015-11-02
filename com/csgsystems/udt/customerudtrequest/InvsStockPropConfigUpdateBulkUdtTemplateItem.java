/*
 * Generated code DO NOT EDIT
 * Generated file: InvsStockPropConfigUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsStockPropConfigUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsStockPropConfigUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsStockPropConfigObjectData InvsStockPropConfigUpdateIn;
/**
 *
 * Constructor to create a  InvsStockPropConfigUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsStockPropConfigUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStockPropConfigObjectData InvsStockPropConfigUpdateInIn) {
    super(id, context, "InvsStockPropConfigUpdate");
    InvsStockPropConfigUpdateIn = InvsStockPropConfigUpdateInIn;
  }

  public void translateToMap() {
    if (InvsStockPropConfigUpdateIn != null) {
      InvsStockPropConfigUpdateIn.resetFlags(true, true);
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectHelper.toMap(InvsStockPropConfigUpdateIn, new HashMap(), "InvsStockPropConfig").get("InvsStockPropConfig"));
    }
  }


/**
 *
 * Sets the InvsStockPropConfig
 * @param InvsStockPropConfigUpdateInIn Value of the InvsStockPropConfigUpdateIn
 *
 */

  public void setInvsStockPropConfig(InvsStockPropConfigObjectData InvsStockPropConfigUpdateInIn) {
    InvsStockPropConfigUpdateIn = InvsStockPropConfigUpdateInIn;
  }

  public void translateFromMap() {
    InvsStockPropConfigUpdateIn = InvsStockPropConfigObjectHelper.fromMap(inputMap, "InvsStockPropConfig");
  }

/**
 *
 * Gets the InvsStockPropConfig
 * @return Value of the InvsStockPropConfig
 *
 */

  public InvsStockPropConfigObjectData getInvsStockPropConfig( ) {
    return InvsStockPropConfigUpdateIn;
  }

}
