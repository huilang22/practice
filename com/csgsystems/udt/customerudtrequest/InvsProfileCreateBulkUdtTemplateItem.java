/*
 * Generated code DO NOT EDIT
 * Generated file: InvsProfileCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsProfileCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsProfileCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsProfileObjectData InvsProfileCreateIn;
/**
 *
 * Constructor to create a  InvsProfileCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsProfileCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsProfileObjectData InvsProfileCreateInIn) {
    super(id, context, "InvsProfileCreate");
    InvsProfileCreateIn = InvsProfileCreateInIn;
  }

  public void translateToMap() {
    if (InvsProfileCreateIn != null) {
      InvsProfileCreateIn.resetFlags(true, true);
      addInput("InvsProfile", InvsProfileObjectHelper.toMap(InvsProfileCreateIn, new HashMap(), "InvsProfile").get("InvsProfile"));
    }
  }


/**
 *
 * Sets the InvsProfile
 * @param InvsProfileCreateInIn Value of the InvsProfileCreateIn
 *
 */

  public void setInvsProfile(InvsProfileObjectData InvsProfileCreateInIn) {
    InvsProfileCreateIn = InvsProfileCreateInIn;
  }

  public void translateFromMap() {
    InvsProfileCreateIn = InvsProfileObjectHelper.fromMap(inputMap, "InvsProfile");
  }

/**
 *
 * Gets the InvsProfile
 * @return Value of the InvsProfile
 *
 */

  public InvsProfileObjectData getInvsProfile( ) {
    return InvsProfileCreateIn;
  }

}
