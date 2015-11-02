/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimSalesChannelRefGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimSalesChannelRefGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimSalesChannelRefGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimSalesChannelRefObjectKeyData InvsSimSalesChannelRefGetIn;
/**
 *
 * Constructor to create a  InvsSimSalesChannelRefGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimSalesChannelRefGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimSalesChannelRefObjectKeyData InvsSimSalesChannelRefGetInIn) {
    super(id, context, "InvsSimSalesChannelRefGet");
    InvsSimSalesChannelRefGetIn = InvsSimSalesChannelRefGetInIn;
  }

  public void translateToMap() {
    if (InvsSimSalesChannelRefGetIn != null) {
      InvsSimSalesChannelRefGetIn.resetFlags(true, true);
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectKeyHelper.toMap(InvsSimSalesChannelRefGetIn, new HashMap(), "InvsSimSalesChannelRefObjectKeyData").get("InvsSimSalesChannelRefObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsSimSalesChannelRef
 * @param InvsSimSalesChannelRefGetInIn Value of the InvsSimSalesChannelRefGetIn
 *
 */

  public void setInvsSimSalesChannelRef(InvsSimSalesChannelRefObjectKeyData InvsSimSalesChannelRefGetInIn) {
    InvsSimSalesChannelRefGetIn = InvsSimSalesChannelRefGetInIn;
  }

  public void translateFromMap() {
    InvsSimSalesChannelRefGetIn = InvsSimSalesChannelRefObjectKeyHelper.fromMap(inputMap, "InvsSimSalesChannelRef");
  }

/**
 *
 * Gets the InvsSimSalesChannelRef
 * @return Value of the InvsSimSalesChannelRef
 *
 */

  public InvsSimSalesChannelRefObjectKeyData getInvsSimSalesChannelRef( ) {
    return InvsSimSalesChannelRefGetIn;
  }

}
