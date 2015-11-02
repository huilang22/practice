/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementExecuteActionBulkUdtTemplateItem.java
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
 * Class used to create a InvElementExecuteActionBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementExecuteActionBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData InvExeActIn;
  protected Integer EquipmentActionId;
/**
 *
 * Constructor to create a  InvElementExecuteActionBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementExecuteActionBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData InvExeActInIn, Integer EquipmentActionIdIn) {
    super(id, context, "InvElementExecuteAction");
    InvExeActIn = InvExeActInIn;
    EquipmentActionId = EquipmentActionIdIn;
  }

  public void translateToMap() {
    if (InvExeActIn != null) {
      InvExeActIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(InvExeActIn, new HashMap(), "Void").get("Void"));
    }
    if (EquipmentActionId != null) {
      addInput("EquipmentActionId", EquipmentActionId);
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvExeActInIn Value of the InvExeActIn
 *
 */

  public void setInvElement(InvElementObjData InvExeActInIn) {
    InvExeActIn = InvExeActInIn;
  }

/**
 *
 * Sets the EquipmentActionId
 * @param EquipmentActionIdIn Value of the EquipmentActionId
 *
 */

  public void setEquipmentActionId(Integer EquipmentActionIdIn) {
    EquipmentActionId = EquipmentActionIdIn;
  }

  public void translateFromMap() {
    InvExeActIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
    EquipmentActionId = (Integer)inputMap.get("EquipmentActionId");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return InvExeActIn;
  }

/**
 *
 * Gets the EquipmentActionId
 * @return Value of the EquipmentActionId
 *
 */

  public Integer getEquipmentActionId( ) {
    return EquipmentActionId;
  }

}
