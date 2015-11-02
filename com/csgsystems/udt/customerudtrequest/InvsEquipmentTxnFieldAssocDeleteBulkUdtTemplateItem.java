/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentTxnFieldAssocDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentTxnFieldAssocDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentTxnFieldAssocDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentTxnFieldAssocObjectKeyData IETFADeleteIn;
/**
 *
 * Constructor to create a  InvsEquipmentTxnFieldAssocDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentTxnFieldAssocDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentTxnFieldAssocObjectKeyData IETFADeleteInIn) {
    super(id, context, "InvsEquipmentTxnFieldAssocDelete");
    IETFADeleteIn = IETFADeleteInIn;
  }

  public void translateToMap() {
    if (IETFADeleteIn != null) {
      IETFADeleteIn.resetFlags(true, true);
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldAssocObjectKeyHelper.toMap(IETFADeleteIn, new HashMap(), "InvsEquipmentTxnFieldAssocObjectKeyData").get("InvsEquipmentTxnFieldAssocObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsEquipmentTxnFieldAssoc
 * @param IETFADeleteInIn Value of the IETFADeleteIn
 *
 */

  public void setInvsEquipmentTxnFieldAssoc(InvsEquipmentTxnFieldAssocObjectKeyData IETFADeleteInIn) {
    IETFADeleteIn = IETFADeleteInIn;
  }

  public void translateFromMap() {
    IETFADeleteIn = InvsEquipmentTxnFieldAssocObjectKeyHelper.fromMap(inputMap, "InvsEquipmentTxnFieldAssoc");
  }

/**
 *
 * Gets the InvsEquipmentTxnFieldAssoc
 * @return Value of the InvsEquipmentTxnFieldAssoc
 *
 */

  public InvsEquipmentTxnFieldAssocObjectKeyData getInvsEquipmentTxnFieldAssoc( ) {
    return IETFADeleteIn;
  }

}
