/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipTxnPostconditionsUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipTxnPostconditionsUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipTxnPostconditionsUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipTxnPostconditionsObjectData IETPUpdateIn;
/**
 *
 * Constructor to create a  InvsEquipTxnPostconditionsUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipTxnPostconditionsUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipTxnPostconditionsObjectData IETPUpdateInIn) {
    super(id, context, "InvsEquipTxnPostconditionsUpdate");
    IETPUpdateIn = IETPUpdateInIn;
  }

  public void translateToMap() {
    if (IETPUpdateIn != null) {
      IETPUpdateIn.resetFlags(true, true);
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectHelper.toMap(IETPUpdateIn, new HashMap(), "InvsEquipTxnPostconditions").get("InvsEquipTxnPostconditions"));
    }
  }


/**
 *
 * Sets the InvsEquipTxnPostconditions
 * @param IETPUpdateInIn Value of the IETPUpdateIn
 *
 */

  public void setInvsEquipTxnPostconditions(InvsEquipTxnPostconditionsObjectData IETPUpdateInIn) {
    IETPUpdateIn = IETPUpdateInIn;
  }

  public void translateFromMap() {
    IETPUpdateIn = InvsEquipTxnPostconditionsObjectHelper.fromMap(inputMap, "InvsEquipTxnPostconditions");
  }

/**
 *
 * Gets the InvsEquipTxnPostconditions
 * @return Value of the InvsEquipTxnPostconditions
 *
 */

  public InvsEquipTxnPostconditionsObjectData getInvsEquipTxnPostconditions( ) {
    return IETPUpdateIn;
  }

}
