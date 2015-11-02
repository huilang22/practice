/*
 * Generated code DO NOT EDIT
 * Generated file: InvsStockPropConfigFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsStockPropConfigFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsStockPropConfigFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsStockPropConfigObjectFilter InvsStockPropConfigFindIn;
/**
 *
 * Constructor to create a  InvsStockPropConfigFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsStockPropConfigFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStockPropConfigObjectFilter InvsStockPropConfigFindInIn) {
    super(id, context, "InvsStockPropConfigFind");
    InvsStockPropConfigFindIn = InvsStockPropConfigFindInIn;
  }

  public void translateToMap() {
    if (InvsStockPropConfigFindIn != null) {
      Integer index =  InvsStockPropConfigFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectHelper.toMap(InvsStockPropConfigFindIn, new HashMap(), "InvsStockPropConfig").get("InvsStockPropConfig"));
    }
  }


/**
 *
 * Sets the InvsStockPropConfig
 * @param InvsStockPropConfigFindInIn Value of the InvsStockPropConfigFindIn
 *
 */

  public void setInvsStockPropConfig(InvsStockPropConfigObjectFilter InvsStockPropConfigFindInIn) {
    InvsStockPropConfigFindIn = InvsStockPropConfigFindInIn;
  }

  public void translateFromMap() {
    InvsStockPropConfigFindIn = InvsStockPropConfigObjectHelper.fromMapFilter(inputMap, "InvsStockPropConfig");
  }

/**
 *
 * Gets the InvsStockPropConfig
 * @return Value of the InvsStockPropConfig
 *
 */

  public InvsStockPropConfigObjectFilter getInvsStockPropConfig( ) {
    return InvsStockPropConfigFindIn;
  }

}
