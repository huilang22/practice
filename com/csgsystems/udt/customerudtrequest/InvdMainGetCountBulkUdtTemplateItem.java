/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainGetCountBulkUdtTemplateItem.java
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
 * Class used to create a InvdMainGetCountBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdMainGetCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdMainObjectFilter InvdMainGetCountIn;
/**
 *
 * Constructor to create a  InvdMainGetCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdMainGetCountBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainObjectFilter InvdMainGetCountInIn) {
    super(id, context, "InvdMainGetCount");
    InvdMainGetCountIn = InvdMainGetCountInIn;
  }

  public void translateToMap() {
    if (InvdMainGetCountIn != null) {
      Integer index =  InvdMainGetCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdMain", InvdMainObjectHelper.toMap(InvdMainGetCountIn, new HashMap(), "InvdMainCount").get("InvdMainCount"));
    }
  }


/**
 *
 * Sets the InvdMain
 * @param InvdMainGetCountInIn Value of the InvdMainGetCountIn
 *
 */

  public void setInvdMain(InvdMainObjectFilter InvdMainGetCountInIn) {
    InvdMainGetCountIn = InvdMainGetCountInIn;
  }

  public void translateFromMap() {
    InvdMainGetCountIn = InvdMainObjectHelper.fromMapFilter(inputMap, "InvdMain");
  }

/**
 *
 * Gets the InvdMain
 * @return Value of the InvdMain
 *
 */

  public InvdMainObjectFilter getInvdMain( ) {
    return InvdMainGetCountIn;
  }

}
