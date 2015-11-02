/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentCondDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentCondDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentCondDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentCondObjectKeyData IECDeleteIn;
/**
 *
 * Constructor to create a  InvsEquipmentCondDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentCondDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentCondObjectKeyData IECDeleteInIn) {
    super(id, context, "InvsEquipmentCondDelete");
    IECDeleteIn = IECDeleteInIn;
  }

  public void translateToMap() {
    if (IECDeleteIn != null) {
      IECDeleteIn.resetFlags(true, true);
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectKeyHelper.toMap(IECDeleteIn, new HashMap(), "InvsEquipmentCondObjectKeyData").get("InvsEquipmentCondObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsEquipmentCond
 * @param IECDeleteInIn Value of the IECDeleteIn
 *
 */

  public void setInvsEquipmentCond(InvsEquipmentCondObjectKeyData IECDeleteInIn) {
    IECDeleteIn = IECDeleteInIn;
  }

  public void translateFromMap() {
    IECDeleteIn = InvsEquipmentCondObjectKeyHelper.fromMap(inputMap, "InvsEquipmentCond");
  }

/**
 *
 * Gets the InvsEquipmentCond
 * @return Value of the InvsEquipmentCond
 *
 */

  public InvsEquipmentCondObjectKeyData getInvsEquipmentCond( ) {
    return IECDeleteIn;
  }

}
