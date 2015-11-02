/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentCondFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentCondFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentCondFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentCondObjectFilter IECFindIn;
/**
 *
 * Constructor to create a  InvsEquipmentCondFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentCondFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentCondObjectFilter IECFindInIn) {
    super(id, context, "InvsEquipmentCondFind");
    IECFindIn = IECFindInIn;
  }

  public void translateToMap() {
    if (IECFindIn != null) {
      Integer index =  IECFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectHelper.toMap(IECFindIn, new HashMap(), "InvsEquipmentCond").get("InvsEquipmentCond"));
    }
  }


/**
 *
 * Sets the InvsEquipmentCond
 * @param IECFindInIn Value of the IECFindIn
 *
 */

  public void setInvsEquipmentCond(InvsEquipmentCondObjectFilter IECFindInIn) {
    IECFindIn = IECFindInIn;
  }

  public void translateFromMap() {
    IECFindIn = InvsEquipmentCondObjectHelper.fromMapFilter(inputMap, "InvsEquipmentCond");
  }

/**
 *
 * Gets the InvsEquipmentCond
 * @return Value of the InvsEquipmentCond
 *
 */

  public InvsEquipmentCondObjectFilter getInvsEquipmentCond( ) {
    return IECFindIn;
  }

}
