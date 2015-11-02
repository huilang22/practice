/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimResellerCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimResellerCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimResellerCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimResellerObjectData InvsSimResellerCreateIn;
/**
 *
 * Constructor to create a  InvsSimResellerCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimResellerCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimResellerObjectData InvsSimResellerCreateInIn) {
    super(id, context, "InvsSimResellerCreate");
    InvsSimResellerCreateIn = InvsSimResellerCreateInIn;
  }

  public void translateToMap() {
    if (InvsSimResellerCreateIn != null) {
      InvsSimResellerCreateIn.resetFlags(true, true);
      addInput("InvsSimReseller", InvsSimResellerObjectHelper.toMap(InvsSimResellerCreateIn, new HashMap(), "InvsSimReseller").get("InvsSimReseller"));
    }
  }


/**
 *
 * Sets the InvsSimReseller
 * @param InvsSimResellerCreateInIn Value of the InvsSimResellerCreateIn
 *
 */

  public void setInvsSimReseller(InvsSimResellerObjectData InvsSimResellerCreateInIn) {
    InvsSimResellerCreateIn = InvsSimResellerCreateInIn;
  }

  public void translateFromMap() {
    InvsSimResellerCreateIn = InvsSimResellerObjectHelper.fromMap(inputMap, "InvsSimReseller");
  }

/**
 *
 * Gets the InvsSimReseller
 * @return Value of the InvsSimReseller
 *
 */

  public InvsSimResellerObjectData getInvsSimReseller( ) {
    return InvsSimResellerCreateIn;
  }

}
