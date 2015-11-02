/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentTxnDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentTxnDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentTxnDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentTxnObjectKeyData IETDeleteIn;
/**
 *
 * Constructor to create a  InvsEquipmentTxnDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentTxnDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentTxnObjectKeyData IETDeleteInIn) {
    super(id, context, "InvsEquipmentTxnDelete");
    IETDeleteIn = IETDeleteInIn;
  }

  public void translateToMap() {
    if (IETDeleteIn != null) {
      IETDeleteIn.resetFlags(true, true);
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectKeyHelper.toMap(IETDeleteIn, new HashMap(), "InvsEquipmentTxnObjectKeyData").get("InvsEquipmentTxnObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsEquipmentTxn
 * @param IETDeleteInIn Value of the IETDeleteIn
 *
 */

  public void setInvsEquipmentTxn(InvsEquipmentTxnObjectKeyData IETDeleteInIn) {
    IETDeleteIn = IETDeleteInIn;
  }

  public void translateFromMap() {
    IETDeleteIn = InvsEquipmentTxnObjectKeyHelper.fromMap(inputMap, "InvsEquipmentTxn");
  }

/**
 *
 * Gets the InvsEquipmentTxn
 * @return Value of the InvsEquipmentTxn
 *
 */

  public InvsEquipmentTxnObjectKeyData getInvsEquipmentTxn( ) {
    return IETDeleteIn;
  }

}
