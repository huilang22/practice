/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentActionFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentActionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentActionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentActionObjectFilter InvsEquipmentActionFindIn;
/**
 *
 * Constructor to create a  InvsEquipmentActionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentActionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentActionObjectFilter InvsEquipmentActionFindInIn) {
    super(id, context, "InvsEquipmentActionFind");
    InvsEquipmentActionFindIn = InvsEquipmentActionFindInIn;
  }

  public void translateToMap() {
    if (InvsEquipmentActionFindIn != null) {
      Integer index =  InvsEquipmentActionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectHelper.toMap(InvsEquipmentActionFindIn, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }


/**
 *
 * Sets the InvsEquipmentAction
 * @param InvsEquipmentActionFindInIn Value of the InvsEquipmentActionFindIn
 *
 */

  public void setInvsEquipmentAction(InvsEquipmentActionObjectFilter InvsEquipmentActionFindInIn) {
    InvsEquipmentActionFindIn = InvsEquipmentActionFindInIn;
  }

  public void translateFromMap() {
    InvsEquipmentActionFindIn = InvsEquipmentActionObjectHelper.fromMapFilter(inputMap, "InvsEquipmentAction");
  }

/**
 *
 * Gets the InvsEquipmentAction
 * @return Value of the InvsEquipmentAction
 *
 */

  public InvsEquipmentActionObjectFilter getInvsEquipmentAction( ) {
    return InvsEquipmentActionFindIn;
  }

}
