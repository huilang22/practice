/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimResellerRefUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimResellerRefUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimResellerRefUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimResellerRefObjectData InvsSimResellerRefUpdateIn;
/**
 *
 * Constructor to create a  InvsSimResellerRefUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimResellerRefUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimResellerRefObjectData InvsSimResellerRefUpdateInIn) {
    super(id, context, "InvsSimResellerRefUpdate");
    InvsSimResellerRefUpdateIn = InvsSimResellerRefUpdateInIn;
  }

  public void translateToMap() {
    if (InvsSimResellerRefUpdateIn != null) {
      InvsSimResellerRefUpdateIn.resetFlags(true, true);
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectHelper.toMap(InvsSimResellerRefUpdateIn, new HashMap(), "InvsSimResellerRef").get("InvsSimResellerRef"));
    }
  }


/**
 *
 * Sets the InvsSimResellerRef
 * @param InvsSimResellerRefUpdateInIn Value of the InvsSimResellerRefUpdateIn
 *
 */

  public void setInvsSimResellerRef(InvsSimResellerRefObjectData InvsSimResellerRefUpdateInIn) {
    InvsSimResellerRefUpdateIn = InvsSimResellerRefUpdateInIn;
  }

  public void translateFromMap() {
    InvsSimResellerRefUpdateIn = InvsSimResellerRefObjectHelper.fromMap(inputMap, "InvsSimResellerRef");
  }

/**
 *
 * Gets the InvsSimResellerRef
 * @return Value of the InvsSimResellerRef
 *
 */

  public InvsSimResellerRefObjectData getInvsSimResellerRef( ) {
    return InvsSimResellerRefUpdateIn;
  }

}
