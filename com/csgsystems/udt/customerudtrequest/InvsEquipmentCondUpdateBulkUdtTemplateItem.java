/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentCondUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentCondUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentCondUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentCondObjectData IECUpdateIn;
/**
 *
 * Constructor to create a  InvsEquipmentCondUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentCondUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentCondObjectData IECUpdateInIn) {
    super(id, context, "InvsEquipmentCondUpdate");
    IECUpdateIn = IECUpdateInIn;
  }

  public void translateToMap() {
    if (IECUpdateIn != null) {
      IECUpdateIn.resetFlags(true, true);
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectHelper.toMap(IECUpdateIn, new HashMap(), "InvsEquipmentCond").get("InvsEquipmentCond"));
    }
  }


/**
 *
 * Sets the InvsEquipmentCond
 * @param IECUpdateInIn Value of the IECUpdateIn
 *
 */

  public void setInvsEquipmentCond(InvsEquipmentCondObjectData IECUpdateInIn) {
    IECUpdateIn = IECUpdateInIn;
  }

  public void translateFromMap() {
    IECUpdateIn = InvsEquipmentCondObjectHelper.fromMap(inputMap, "InvsEquipmentCond");
  }

/**
 *
 * Gets the InvsEquipmentCond
 * @return Value of the InvsEquipmentCond
 *
 */

  public InvsEquipmentCondObjectData getInvsEquipmentCond( ) {
    return IECUpdateIn;
  }

}
