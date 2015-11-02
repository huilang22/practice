/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipTxnPreconditionsUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipTxnPreconditionsUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipTxnPreconditionsUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipTxnPreconditionsObjectData IETPUpdateIn;
/**
 *
 * Constructor to create a  InvsEquipTxnPreconditionsUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipTxnPreconditionsUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipTxnPreconditionsObjectData IETPUpdateInIn) {
    super(id, context, "InvsEquipTxnPreconditionsUpdate");
    IETPUpdateIn = IETPUpdateInIn;
  }

  public void translateToMap() {
    if (IETPUpdateIn != null) {
      IETPUpdateIn.resetFlags(true, true);
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectHelper.toMap(IETPUpdateIn, new HashMap(), "InvsEquipTxnPreconditions").get("InvsEquipTxnPreconditions"));
    }
  }


/**
 *
 * Sets the InvsEquipTxnPreconditions
 * @param IETPUpdateInIn Value of the IETPUpdateIn
 *
 */

  public void setInvsEquipTxnPreconditions(InvsEquipTxnPreconditionsObjectData IETPUpdateInIn) {
    IETPUpdateIn = IETPUpdateInIn;
  }

  public void translateFromMap() {
    IETPUpdateIn = InvsEquipTxnPreconditionsObjectHelper.fromMap(inputMap, "InvsEquipTxnPreconditions");
  }

/**
 *
 * Gets the InvsEquipTxnPreconditions
 * @return Value of the InvsEquipTxnPreconditions
 *
 */

  public InvsEquipTxnPreconditionsObjectData getInvsEquipTxnPreconditions( ) {
    return IETPUpdateIn;
  }

}
