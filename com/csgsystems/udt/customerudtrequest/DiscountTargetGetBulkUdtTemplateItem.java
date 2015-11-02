/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountTargetGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a DiscountTargetGetBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountTargetGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DTObjectKeyData DTGetIn;
/**
 *
 * Constructor to create a  DiscountTargetGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountTargetGetBulkUdtTemplateItem(String id, BSDMSessionContext context, DTObjectKeyData DTGetInIn) {
    super(id, context, "DiscountTargetGet");
    DTGetIn = DTGetInIn;
  }

  public void translateToMap() {
    if (DTGetIn != null) {
      DTGetIn.resetFlags(true, true);
      addInput("DiscountTarget", DTObjectKeyHelper.toMap(DTGetIn, new HashMap(), "DTObjectKeyData").get("DTObjectKeyData"));
    }
  }


/**
 *
 * Sets the DiscountTarget
 * @param DTGetInIn Value of the DTGetIn
 *
 */

  public void setDiscountTarget(DTObjectKeyData DTGetInIn) {
    DTGetIn = DTGetInIn;
  }

  public void translateFromMap() {
    DTGetIn = DTObjectKeyHelper.fromMap(inputMap, "DiscountTarget");
  }

/**
 *
 * Gets the DiscountTarget
 * @return Value of the DiscountTarget
 *
 */

  public DTObjectKeyData getDiscountTarget( ) {
    return DTGetIn;
  }

}
