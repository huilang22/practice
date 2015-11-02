/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentCondGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentCondGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentCondGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentCondObjectKeyData IECGetIn;
/**
 *
 * Constructor to create a  InvsEquipmentCondGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentCondGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentCondObjectKeyData IECGetInIn) {
    super(id, context, "InvsEquipmentCondGet");
    IECGetIn = IECGetInIn;
  }

  public void translateToMap() {
    if (IECGetIn != null) {
      IECGetIn.resetFlags(true, true);
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectKeyHelper.toMap(IECGetIn, new HashMap(), "InvsEquipmentCondObjectKeyData").get("InvsEquipmentCondObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsEquipmentCond
 * @param IECGetInIn Value of the IECGetIn
 *
 */

  public void setInvsEquipmentCond(InvsEquipmentCondObjectKeyData IECGetInIn) {
    IECGetIn = IECGetInIn;
  }

  public void translateFromMap() {
    IECGetIn = InvsEquipmentCondObjectKeyHelper.fromMap(inputMap, "InvsEquipmentCond");
  }

/**
 *
 * Gets the InvsEquipmentCond
 * @return Value of the InvsEquipmentCond
 *
 */

  public InvsEquipmentCondObjectKeyData getInvsEquipmentCond( ) {
    return IECGetIn;
  }

}
