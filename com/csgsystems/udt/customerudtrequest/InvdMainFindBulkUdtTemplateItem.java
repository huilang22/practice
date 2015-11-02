/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainFindBulkUdtTemplateItem.java
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
 * Class used to create a InvdMainFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdMainFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdMainObjectFilter InvdMainFindIn;
/**
 *
 * Constructor to create a  InvdMainFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdMainFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainObjectFilter InvdMainFindInIn) {
    super(id, context, "InvdMainFind");
    InvdMainFindIn = InvdMainFindInIn;
  }

  public void translateToMap() {
    if (InvdMainFindIn != null) {
      Integer index =  InvdMainFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdMain", InvdMainObjectHelper.toMap(InvdMainFindIn, new HashMap(), "InvdMain").get("InvdMain"));
    }
  }


/**
 *
 * Sets the InvdMain
 * @param InvdMainFindInIn Value of the InvdMainFindIn
 *
 */

  public void setInvdMain(InvdMainObjectFilter InvdMainFindInIn) {
    InvdMainFindIn = InvdMainFindInIn;
  }

  public void translateFromMap() {
    InvdMainFindIn = InvdMainObjectHelper.fromMapFilter(inputMap, "InvdMain");
  }

/**
 *
 * Gets the InvdMain
 * @return Value of the InvdMain
 *
 */

  public InvdMainObjectFilter getInvdMain( ) {
    return InvdMainFindIn;
  }

}
