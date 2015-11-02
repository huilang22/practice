/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountTargetDeleteBulkUdtTemplateItem.java
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
 * Class used to create a DiscountTargetDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountTargetDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DTObjectKeyData DTDeleteIn;
/**
 *
 * Constructor to create a  DiscountTargetDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountTargetDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, DTObjectKeyData DTDeleteInIn) {
    super(id, context, "DiscountTargetDelete");
    DTDeleteIn = DTDeleteInIn;
  }

  public void translateToMap() {
    if (DTDeleteIn != null) {
      DTDeleteIn.resetFlags(true, true);
      addInput("DiscountTarget", DTObjectKeyHelper.toMap(DTDeleteIn, new HashMap(), "DTObjectKeyData").get("DTObjectKeyData"));
    }
  }


/**
 *
 * Sets the DiscountTarget
 * @param DTDeleteInIn Value of the DTDeleteIn
 *
 */

  public void setDiscountTarget(DTObjectKeyData DTDeleteInIn) {
    DTDeleteIn = DTDeleteInIn;
  }

  public void translateFromMap() {
    DTDeleteIn = DTObjectKeyHelper.fromMap(inputMap, "DiscountTarget");
  }

/**
 *
 * Gets the DiscountTarget
 * @return Value of the DiscountTarget
 *
 */

  public DTObjectKeyData getDiscountTarget( ) {
    return DTDeleteIn;
  }

}
