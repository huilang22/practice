/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationObjectData InvsLocationUpdateIn;
/**
 *
 * Constructor to create a  InvsLocationUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationObjectData InvsLocationUpdateInIn) {
    super(id, context, "InvsLocationUpdate");
    InvsLocationUpdateIn = InvsLocationUpdateInIn;
  }

  public void translateToMap() {
    if (InvsLocationUpdateIn != null) {
      InvsLocationUpdateIn.resetFlags(true, true);
      addInput("InvsLocation", InvsLocationObjectHelper.toMap(InvsLocationUpdateIn, new HashMap(), "InvsLocation").get("InvsLocation"));
    }
  }


/**
 *
 * Sets the InvsLocation
 * @param InvsLocationUpdateInIn Value of the InvsLocationUpdateIn
 *
 */

  public void setInvsLocation(InvsLocationObjectData InvsLocationUpdateInIn) {
    InvsLocationUpdateIn = InvsLocationUpdateInIn;
  }

  public void translateFromMap() {
    InvsLocationUpdateIn = InvsLocationObjectHelper.fromMap(inputMap, "InvsLocation");
  }

/**
 *
 * Gets the InvsLocation
 * @return Value of the InvsLocation
 *
 */

  public InvsLocationObjectData getInvsLocation( ) {
    return InvsLocationUpdateIn;
  }

}
