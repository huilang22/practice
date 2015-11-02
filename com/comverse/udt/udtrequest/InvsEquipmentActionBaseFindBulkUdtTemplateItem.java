/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionBaseFindBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a InvsEquipmentActionBaseFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentActionBaseFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentActionBaseObjectFilter InvsEquipmentActionBaseFindIn;
/**
 *
 * Constructor to create a  InvsEquipmentActionBaseFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentActionBaseFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentActionBaseObjectFilter InvsEquipmentActionBaseFindInIn) {
    super(id, context, "InvsEquipmentActionBaseFind");
    InvsEquipmentActionBaseFindIn = InvsEquipmentActionBaseFindInIn;
  }

  public void translateToMap() {
    if (InvsEquipmentActionBaseFindIn != null) {
      Integer index =  InvsEquipmentActionBaseFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsEquipmentAction", InvsEquipmentActionBaseObjectHelper.toMap(InvsEquipmentActionBaseFindIn, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }


/**
 *
 * Sets the InvsEquipmentAction
 * @param InvsEquipmentActionBaseFindInIn Value of the InvsEquipmentActionBaseFindIn
 *
 */

  public void setInvsEquipmentAction(InvsEquipmentActionBaseObjectFilter InvsEquipmentActionBaseFindInIn) {
    InvsEquipmentActionBaseFindIn = InvsEquipmentActionBaseFindInIn;
  }

  public void translateFromMap() {
    InvsEquipmentActionBaseFindIn = InvsEquipmentActionBaseObjectHelper.fromMapFilter(inputMap, "InvsEquipmentAction");
  }

/**
 *
 * Gets the InvsEquipmentAction
 * @return Value of the InvsEquipmentAction
 *
 */

  public InvsEquipmentActionBaseObjectFilter getInvsEquipmentAction( ) {
    return InvsEquipmentActionBaseFindIn;
  }

}
