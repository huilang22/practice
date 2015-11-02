/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVendorRefFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsVendorRefFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsVendorRefFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsVendorRefObjectFilter InvsVendorRefFindIn;
/**
 *
 * Constructor to create a  InvsVendorRefFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsVendorRefFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVendorRefObjectFilter InvsVendorRefFindInIn) {
    super(id, context, "InvsVendorRefFind");
    InvsVendorRefFindIn = InvsVendorRefFindInIn;
  }

  public void translateToMap() {
    if (InvsVendorRefFindIn != null) {
      Integer index =  InvsVendorRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsVendorRef", InvsVendorRefObjectHelper.toMap(InvsVendorRefFindIn, new HashMap(), "InvsVendorRef").get("InvsVendorRef"));
    }
  }


/**
 *
 * Sets the InvsVendorRef
 * @param InvsVendorRefFindInIn Value of the InvsVendorRefFindIn
 *
 */

  public void setInvsVendorRef(InvsVendorRefObjectFilter InvsVendorRefFindInIn) {
    InvsVendorRefFindIn = InvsVendorRefFindInIn;
  }

  public void translateFromMap() {
    InvsVendorRefFindIn = InvsVendorRefObjectHelper.fromMapFilter(inputMap, "InvsVendorRef");
  }

/**
 *
 * Gets the InvsVendorRef
 * @return Value of the InvsVendorRef
 *
 */

  public InvsVendorRefObjectFilter getInvsVendorRef( ) {
    return InvsVendorRefFindIn;
  }

}
