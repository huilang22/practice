/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementTxnUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvElementTxnUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementTxnUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData[] InvElementTxnUpdateIn;
  protected Integer EquipmentTransactionId;
/**
 *
 * Constructor to create a  InvElementTxnUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementTxnUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData[] InvElementTxnUpdateInIn, Integer EquipmentTransactionIdIn) {
    super(id, context, "InvElementTxnUpdate");
    InvElementTxnUpdateIn = InvElementTxnUpdateInIn;
    EquipmentTransactionId = EquipmentTransactionIdIn;
  }

  public void translateToMap() {
    if (InvElementTxnUpdateIn != null) {
      if (InvElementTxnUpdateIn != null) {
        Object[] list = new Object[InvElementTxnUpdateIn.length];
        for (int i = 0; i < InvElementTxnUpdateIn.length; i++) {
          list[i] = InvElementObjHelper.getMap(InvElementTxnUpdateIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "InvElement");
        }
        addInput("InvElementList", list);
      }
    }
    if (EquipmentTransactionId != null) {
      addInput("EquipmentTransactionId", EquipmentTransactionId);
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvElementTxnUpdateInIn Value of the InvElementTxnUpdateIn
 *
 */

  public void setInvElement(InvElementObjData[] InvElementTxnUpdateInIn) {
    InvElementTxnUpdateIn = InvElementTxnUpdateInIn;
  }

/**
 *
 * Sets the EquipmentTransactionId
 * @param EquipmentTransactionIdIn Value of the EquipmentTransactionId
 *
 */

  public void setEquipmentTransactionId(Integer EquipmentTransactionIdIn) {
    EquipmentTransactionId = EquipmentTransactionIdIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("InvElementList");
    if (list != null) {
      InvElementTxnUpdateIn = new InvElementObjData[list.length];
      for (int i = 0; i < list.length; i++) {
        InvElementTxnUpdateIn[i] = InvElementObjHelper.getObj((Map) list[i]);
        InvElementTxnUpdateIn[i].resetFlags(true, true);
      }
    }
    EquipmentTransactionId = (Integer)inputMap.get("EquipmentTransactionId");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData[] getInvElement( ) {
    return InvElementTxnUpdateIn;
  }

/**
 *
 * Gets the EquipmentTransactionId
 * @return Value of the EquipmentTransactionId
 *
 */

  public Integer getEquipmentTransactionId( ) {
    return EquipmentTransactionId;
  }

}
