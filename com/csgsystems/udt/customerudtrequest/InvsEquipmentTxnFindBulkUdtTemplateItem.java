/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentTxnFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentTxnFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentTxnFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentTxnObjectFilter IETFindIn;
/**
 *
 * Constructor to create a  InvsEquipmentTxnFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentTxnFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentTxnObjectFilter IETFindInIn) {
    super(id, context, "InvsEquipmentTxnFind");
    IETFindIn = IETFindInIn;
  }

  public void translateToMap() {
    if (IETFindIn != null) {
      Integer index =  IETFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectHelper.toMap(IETFindIn, new HashMap(), "InvsEquipmentTxn").get("InvsEquipmentTxn"));
    }
  }


/**
 *
 * Sets the InvsEquipmentTxn
 * @param IETFindInIn Value of the IETFindIn
 *
 */

  public void setInvsEquipmentTxn(InvsEquipmentTxnObjectFilter IETFindInIn) {
    IETFindIn = IETFindInIn;
  }

  public void translateFromMap() {
    IETFindIn = InvsEquipmentTxnObjectHelper.fromMapFilter(inputMap, "InvsEquipmentTxn");
  }

/**
 *
 * Gets the InvsEquipmentTxn
 * @return Value of the InvsEquipmentTxn
 *
 */

  public InvsEquipmentTxnObjectFilter getInvsEquipmentTxn( ) {
    return IETFindIn;
  }

}
