/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipTxnPreconditionsCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipTxnPreconditionsCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipTxnPreconditionsCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipTxnPreconditionsObjectData IETPCreateIn;
/**
 *
 * Constructor to create a  InvsEquipTxnPreconditionsCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipTxnPreconditionsCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipTxnPreconditionsObjectData IETPCreateInIn) {
    super(id, context, "InvsEquipTxnPreconditionsCreate");
    IETPCreateIn = IETPCreateInIn;
  }

  public void translateToMap() {
    if (IETPCreateIn != null) {
      IETPCreateIn.resetFlags(true, true);
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectHelper.toMap(IETPCreateIn, new HashMap(), "InvsEquipTxnPreconditions").get("InvsEquipTxnPreconditions"));
    }
  }


/**
 *
 * Sets the InvsEquipTxnPreconditions
 * @param IETPCreateInIn Value of the IETPCreateIn
 *
 */

  public void setInvsEquipTxnPreconditions(InvsEquipTxnPreconditionsObjectData IETPCreateInIn) {
    IETPCreateIn = IETPCreateInIn;
  }

  public void translateFromMap() {
    IETPCreateIn = InvsEquipTxnPreconditionsObjectHelper.fromMap(inputMap, "InvsEquipTxnPreconditions");
  }

/**
 *
 * Gets the InvsEquipTxnPreconditions
 * @return Value of the InvsEquipTxnPreconditions
 *
 */

  public InvsEquipTxnPreconditionsObjectData getInvsEquipTxnPreconditions( ) {
    return IETPCreateIn;
  }

}
