/*
 * Generated code DO NOT EDIT
 * Generated file: InvsProfileUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsProfileUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsProfileUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsProfileObjectData InvsProfileUpdateIn;
/**
 *
 * Constructor to create a  InvsProfileUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsProfileUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsProfileObjectData InvsProfileUpdateInIn) {
    super(id, context, "InvsProfileUpdate");
    InvsProfileUpdateIn = InvsProfileUpdateInIn;
  }

  public void translateToMap() {
    if (InvsProfileUpdateIn != null) {
      InvsProfileUpdateIn.resetFlags(true, true);
      addInput("InvsProfile", InvsProfileObjectHelper.toMap(InvsProfileUpdateIn, new HashMap(), "InvsProfile").get("InvsProfile"));
    }
  }


/**
 *
 * Sets the InvsProfile
 * @param InvsProfileUpdateInIn Value of the InvsProfileUpdateIn
 *
 */

  public void setInvsProfile(InvsProfileObjectData InvsProfileUpdateInIn) {
    InvsProfileUpdateIn = InvsProfileUpdateInIn;
  }

  public void translateFromMap() {
    InvsProfileUpdateIn = InvsProfileObjectHelper.fromMap(inputMap, "InvsProfile");
  }

/**
 *
 * Gets the InvsProfile
 * @return Value of the InvsProfile
 *
 */

  public InvsProfileObjectData getInvsProfile( ) {
    return InvsProfileUpdateIn;
  }

}
