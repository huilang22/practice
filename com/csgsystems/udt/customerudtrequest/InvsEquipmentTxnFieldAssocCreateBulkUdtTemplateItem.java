/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentTxnFieldAssocCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentTxnFieldAssocCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentTxnFieldAssocCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentTxnFieldAssocObjectData IETFACreateIn;
/**
 *
 * Constructor to create a  InvsEquipmentTxnFieldAssocCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentTxnFieldAssocCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentTxnFieldAssocObjectData IETFACreateInIn) {
    super(id, context, "InvsEquipmentTxnFieldAssocCreate");
    IETFACreateIn = IETFACreateInIn;
  }

  public void translateToMap() {
    if (IETFACreateIn != null) {
      IETFACreateIn.resetFlags(true, true);
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldAssocObjectHelper.toMap(IETFACreateIn, new HashMap(), "InvsEquipmentTxnFieldAssoc").get("InvsEquipmentTxnFieldAssoc"));
    }
  }


/**
 *
 * Sets the InvsEquipmentTxnFieldAssoc
 * @param IETFACreateInIn Value of the IETFACreateIn
 *
 */

  public void setInvsEquipmentTxnFieldAssoc(InvsEquipmentTxnFieldAssocObjectData IETFACreateInIn) {
    IETFACreateIn = IETFACreateInIn;
  }

  public void translateFromMap() {
    IETFACreateIn = InvsEquipmentTxnFieldAssocObjectHelper.fromMap(inputMap, "InvsEquipmentTxnFieldAssoc");
  }

/**
 *
 * Gets the InvsEquipmentTxnFieldAssoc
 * @return Value of the InvsEquipmentTxnFieldAssoc
 *
 */

  public InvsEquipmentTxnFieldAssocObjectData getInvsEquipmentTxnFieldAssoc( ) {
    return IETFACreateIn;
  }

}
