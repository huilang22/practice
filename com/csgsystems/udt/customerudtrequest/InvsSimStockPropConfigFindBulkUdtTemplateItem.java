/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimStockPropConfigFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimStockPropConfigFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimStockPropConfigFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimStockPropConfigObjectFilter InvsSimStockPropConfigFindIn;
/**
 *
 * Constructor to create a  InvsSimStockPropConfigFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimStockPropConfigFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimStockPropConfigObjectFilter InvsSimStockPropConfigFindInIn) {
    super(id, context, "InvsSimStockPropConfigFind");
    InvsSimStockPropConfigFindIn = InvsSimStockPropConfigFindInIn;
  }

  public void translateToMap() {
    if (InvsSimStockPropConfigFindIn != null) {
      Integer index =  InvsSimStockPropConfigFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectHelper.toMap(InvsSimStockPropConfigFindIn, new HashMap(), "InvsSimStockPropConfig").get("InvsSimStockPropConfig"));
    }
  }


/**
 *
 * Sets the InvsSimStockPropConfig
 * @param InvsSimStockPropConfigFindInIn Value of the InvsSimStockPropConfigFindIn
 *
 */

  public void setInvsSimStockPropConfig(InvsSimStockPropConfigObjectFilter InvsSimStockPropConfigFindInIn) {
    InvsSimStockPropConfigFindIn = InvsSimStockPropConfigFindInIn;
  }

  public void translateFromMap() {
    InvsSimStockPropConfigFindIn = InvsSimStockPropConfigObjectHelper.fromMapFilter(inputMap, "InvsSimStockPropConfig");
  }

/**
 *
 * Gets the InvsSimStockPropConfig
 * @return Value of the InvsSimStockPropConfig
 *
 */

  public InvsSimStockPropConfigObjectFilter getInvsSimStockPropConfig( ) {
    return InvsSimStockPropConfigFindIn;
  }

}
