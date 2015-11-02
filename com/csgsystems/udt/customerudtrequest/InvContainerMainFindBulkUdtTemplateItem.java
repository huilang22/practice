/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerMainFindBulkUdtTemplateItem.java
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
 * Class used to create a InvContainerMainFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvContainerMainFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvContainerMainObjectFilter InvContainerMainFindIn;
/**
 *
 * Constructor to create a  InvContainerMainFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvContainerMainFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerMainObjectFilter InvContainerMainFindInIn) {
    super(id, context, "InvContainerMainFind");
    InvContainerMainFindIn = InvContainerMainFindInIn;
  }

  public void translateToMap() {
    if (InvContainerMainFindIn != null) {
      Integer index =  InvContainerMainFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvContainerMain", InvContainerMainObjectHelper.toMap(InvContainerMainFindIn, new HashMap(), "InvContainerMain").get("InvContainerMain"));
    }
  }


/**
 *
 * Sets the InvContainerMain
 * @param InvContainerMainFindInIn Value of the InvContainerMainFindIn
 *
 */

  public void setInvContainerMain(InvContainerMainObjectFilter InvContainerMainFindInIn) {
    InvContainerMainFindIn = InvContainerMainFindInIn;
  }

  public void translateFromMap() {
    InvContainerMainFindIn = InvContainerMainObjectHelper.fromMapFilter(inputMap, "InvContainerMain");
  }

/**
 *
 * Gets the InvContainerMain
 * @return Value of the InvContainerMain
 *
 */

  public InvContainerMainObjectFilter getInvContainerMain( ) {
    return InvContainerMainFindIn;
  }

}
