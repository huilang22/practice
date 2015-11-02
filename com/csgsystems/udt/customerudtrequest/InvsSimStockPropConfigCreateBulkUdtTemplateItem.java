/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimStockPropConfigCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimStockPropConfigCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimStockPropConfigCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimStockPropConfigObjectData InvsSimStockPropConfigCreateIn;
/**
 *
 * Constructor to create a  InvsSimStockPropConfigCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimStockPropConfigCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimStockPropConfigObjectData InvsSimStockPropConfigCreateInIn) {
    super(id, context, "InvsSimStockPropConfigCreate");
    InvsSimStockPropConfigCreateIn = InvsSimStockPropConfigCreateInIn;
  }

  public void translateToMap() {
    if (InvsSimStockPropConfigCreateIn != null) {
      InvsSimStockPropConfigCreateIn.resetFlags(true, true);
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectHelper.toMap(InvsSimStockPropConfigCreateIn, new HashMap(), "InvsSimStockPropConfig").get("InvsSimStockPropConfig"));
    }
  }


/**
 *
 * Sets the InvsSimStockPropConfig
 * @param InvsSimStockPropConfigCreateInIn Value of the InvsSimStockPropConfigCreateIn
 *
 */

  public void setInvsSimStockPropConfig(InvsSimStockPropConfigObjectData InvsSimStockPropConfigCreateInIn) {
    InvsSimStockPropConfigCreateIn = InvsSimStockPropConfigCreateInIn;
  }

  public void translateFromMap() {
    InvsSimStockPropConfigCreateIn = InvsSimStockPropConfigObjectHelper.fromMap(inputMap, "InvsSimStockPropConfig");
  }

/**
 *
 * Gets the InvsSimStockPropConfig
 * @return Value of the InvsSimStockPropConfig
 *
 */

  public InvsSimStockPropConfigObjectData getInvsSimStockPropConfig( ) {
    return InvsSimStockPropConfigCreateIn;
  }

}
