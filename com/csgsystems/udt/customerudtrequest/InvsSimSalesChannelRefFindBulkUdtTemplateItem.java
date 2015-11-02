/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimSalesChannelRefFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimSalesChannelRefFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimSalesChannelRefFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimSalesChannelRefObjectFilter InvsSimSalesChannelRefFindIn;
/**
 *
 * Constructor to create a  InvsSimSalesChannelRefFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimSalesChannelRefFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimSalesChannelRefObjectFilter InvsSimSalesChannelRefFindInIn) {
    super(id, context, "InvsSimSalesChannelRefFind");
    InvsSimSalesChannelRefFindIn = InvsSimSalesChannelRefFindInIn;
  }

  public void translateToMap() {
    if (InvsSimSalesChannelRefFindIn != null) {
      Integer index =  InvsSimSalesChannelRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectHelper.toMap(InvsSimSalesChannelRefFindIn, new HashMap(), "InvsSimSalesChannelRef").get("InvsSimSalesChannelRef"));
    }
  }


/**
 *
 * Sets the InvsSimSalesChannelRef
 * @param InvsSimSalesChannelRefFindInIn Value of the InvsSimSalesChannelRefFindIn
 *
 */

  public void setInvsSimSalesChannelRef(InvsSimSalesChannelRefObjectFilter InvsSimSalesChannelRefFindInIn) {
    InvsSimSalesChannelRefFindIn = InvsSimSalesChannelRefFindInIn;
  }

  public void translateFromMap() {
    InvsSimSalesChannelRefFindIn = InvsSimSalesChannelRefObjectHelper.fromMapFilter(inputMap, "InvsSimSalesChannelRef");
  }

/**
 *
 * Gets the InvsSimSalesChannelRef
 * @return Value of the InvsSimSalesChannelRef
 *
 */

  public InvsSimSalesChannelRefObjectFilter getInvsSimSalesChannelRef( ) {
    return InvsSimSalesChannelRefFindIn;
  }

}
