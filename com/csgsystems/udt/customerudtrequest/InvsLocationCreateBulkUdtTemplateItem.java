/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationObjectData InvsLocationCreateIn;
/**
 *
 * Constructor to create a  InvsLocationCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationObjectData InvsLocationCreateInIn) {
    super(id, context, "InvsLocationCreate");
    InvsLocationCreateIn = InvsLocationCreateInIn;
  }

  public void translateToMap() {
    if (InvsLocationCreateIn != null) {
      InvsLocationCreateIn.resetFlags(true, true);
      addInput("InvsLocation", InvsLocationObjectHelper.toMap(InvsLocationCreateIn, new HashMap(), "InvsLocation").get("InvsLocation"));
    }
  }


/**
 *
 * Sets the InvsLocation
 * @param InvsLocationCreateInIn Value of the InvsLocationCreateIn
 *
 */

  public void setInvsLocation(InvsLocationObjectData InvsLocationCreateInIn) {
    InvsLocationCreateIn = InvsLocationCreateInIn;
  }

  public void translateFromMap() {
    InvsLocationCreateIn = InvsLocationObjectHelper.fromMap(inputMap, "InvsLocation");
  }

/**
 *
 * Gets the InvsLocation
 * @return Value of the InvsLocation
 *
 */

  public InvsLocationObjectData getInvsLocation( ) {
    return InvsLocationCreateIn;
  }

}
