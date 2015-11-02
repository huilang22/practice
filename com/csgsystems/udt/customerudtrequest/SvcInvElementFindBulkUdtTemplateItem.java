/*
 * Generated code DO NOT EDIT
 * Generated file: SvcInvElementFindBulkUdtTemplateItem.java
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
 * Class used to create a SvcInvElementFindBulkUdtTemplateItem Bulk Template
 *
 */

public class SvcInvElementFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SvcInvElementObjectFilter SvcInvElementFindIn;
/**
 *
 * Constructor to create a  SvcInvElementFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SvcInvElementFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SvcInvElementObjectFilter SvcInvElementFindInIn) {
    super(id, context, "SvcInvElementFind");
    SvcInvElementFindIn = SvcInvElementFindInIn;
  }

  public void translateToMap() {
    if (SvcInvElementFindIn != null) {
      Integer index =  SvcInvElementFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SvcInventory", SvcInvElementObjectHelper.toMap(SvcInvElementFindIn, new HashMap(), "SvcInventory").get("SvcInventory"));
    }
  }


/**
 *
 * Sets the SvcInventory
 * @param SvcInvElementFindInIn Value of the SvcInvElementFindIn
 *
 */

  public void setSvcInventory(SvcInvElementObjectFilter SvcInvElementFindInIn) {
    SvcInvElementFindIn = SvcInvElementFindInIn;
  }

  public void translateFromMap() {
    SvcInvElementFindIn = SvcInvElementObjectHelper.fromMapFilter(inputMap, "SvcInventory");
  }

/**
 *
 * Gets the SvcInventory
 * @return Value of the SvcInventory
 *
 */

  public SvcInvElementObjectFilter getSvcInventory( ) {
    return SvcInvElementFindIn;
  }

}
