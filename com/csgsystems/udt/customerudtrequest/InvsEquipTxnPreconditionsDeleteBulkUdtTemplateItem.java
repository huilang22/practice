/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipTxnPreconditionsDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipTxnPreconditionsDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipTxnPreconditionsDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipTxnPreconditionsObjectKeyData IETPDeleteIn;
/**
 *
 * Constructor to create a  InvsEquipTxnPreconditionsDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipTxnPreconditionsDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipTxnPreconditionsObjectKeyData IETPDeleteInIn) {
    super(id, context, "InvsEquipTxnPreconditionsDelete");
    IETPDeleteIn = IETPDeleteInIn;
  }

  public void translateToMap() {
    if (IETPDeleteIn != null) {
      IETPDeleteIn.resetFlags(true, true);
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectKeyHelper.toMap(IETPDeleteIn, new HashMap(), "InvsEquipTxnPreconditionsObjectKeyData").get("InvsEquipTxnPreconditionsObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsEquipTxnPreconditions
 * @param IETPDeleteInIn Value of the IETPDeleteIn
 *
 */

  public void setInvsEquipTxnPreconditions(InvsEquipTxnPreconditionsObjectKeyData IETPDeleteInIn) {
    IETPDeleteIn = IETPDeleteInIn;
  }

  public void translateFromMap() {
    IETPDeleteIn = InvsEquipTxnPreconditionsObjectKeyHelper.fromMap(inputMap, "InvsEquipTxnPreconditions");
  }

/**
 *
 * Gets the InvsEquipTxnPreconditions
 * @return Value of the InvsEquipTxnPreconditions
 *
 */

  public InvsEquipTxnPreconditionsObjectKeyData getInvsEquipTxnPreconditions( ) {
    return IETPDeleteIn;
  }

}
