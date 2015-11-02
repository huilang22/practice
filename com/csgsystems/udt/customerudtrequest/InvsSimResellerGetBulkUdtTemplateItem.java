/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimResellerGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimResellerGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimResellerGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimResellerObjectKeyData InvsSimResellerGetIn;
/**
 *
 * Constructor to create a  InvsSimResellerGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimResellerGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimResellerObjectKeyData InvsSimResellerGetInIn) {
    super(id, context, "InvsSimResellerGet");
    InvsSimResellerGetIn = InvsSimResellerGetInIn;
  }

  public void translateToMap() {
    if (InvsSimResellerGetIn != null) {
      InvsSimResellerGetIn.resetFlags(true, true);
      addInput("InvsSimReseller", InvsSimResellerObjectKeyHelper.toMap(InvsSimResellerGetIn, new HashMap(), "InvsSimResellerObjectKeyData").get("InvsSimResellerObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsSimReseller
 * @param InvsSimResellerGetInIn Value of the InvsSimResellerGetIn
 *
 */

  public void setInvsSimReseller(InvsSimResellerObjectKeyData InvsSimResellerGetInIn) {
    InvsSimResellerGetIn = InvsSimResellerGetInIn;
  }

  public void translateFromMap() {
    InvsSimResellerGetIn = InvsSimResellerObjectKeyHelper.fromMap(inputMap, "InvsSimReseller");
  }

/**
 *
 * Gets the InvsSimReseller
 * @return Value of the InvsSimReseller
 *
 */

  public InvsSimResellerObjectKeyData getInvsSimReseller( ) {
    return InvsSimResellerGetIn;
  }

}
