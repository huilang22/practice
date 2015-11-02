/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVendorFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsVendorFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsVendorFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsVendorObjectFilter InvsVendorFindIn;
/**
 *
 * Constructor to create a  InvsVendorFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsVendorFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVendorObjectFilter InvsVendorFindInIn) {
    super(id, context, "InvsVendorFind");
    InvsVendorFindIn = InvsVendorFindInIn;
  }

  public void translateToMap() {
    if (InvsVendorFindIn != null) {
      Integer index =  InvsVendorFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsVendor", InvsVendorObjectHelper.toMap(InvsVendorFindIn, new HashMap(), "InvsVendor").get("InvsVendor"));
    }
  }


/**
 *
 * Sets the InvsVendor
 * @param InvsVendorFindInIn Value of the InvsVendorFindIn
 *
 */

  public void setInvsVendor(InvsVendorObjectFilter InvsVendorFindInIn) {
    InvsVendorFindIn = InvsVendorFindInIn;
  }

  public void translateFromMap() {
    InvsVendorFindIn = InvsVendorObjectHelper.fromMapFilter(inputMap, "InvsVendor");
  }

/**
 *
 * Gets the InvsVendor
 * @return Value of the InvsVendor
 *
 */

  public InvsVendorObjectFilter getInvsVendor( ) {
    return InvsVendorFindIn;
  }

}
