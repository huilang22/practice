/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentTxnFieldAssocFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentTxnFieldAssocFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentTxnFieldAssocFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentTxnFieldTablesObjectFilter IETFAFindIn;
/**
 *
 * Constructor to create a  InvsEquipmentTxnFieldAssocFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentTxnFieldAssocFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentTxnFieldTablesObjectFilter IETFAFindInIn) {
    super(id, context, "InvsEquipmentTxnFieldAssocFind");
    IETFAFindIn = IETFAFindInIn;
  }

  public void translateToMap() {
    if (IETFAFindIn != null) {
      Integer index =  IETFAFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldTablesObjectHelper.toMap(IETFAFindIn, new HashMap(), "InvsEquipmentTxnFieldAssoc").get("InvsEquipmentTxnFieldAssoc"));
    }
  }


/**
 *
 * Sets the InvsEquipmentTxnFieldAssoc
 * @param IETFAFindInIn Value of the IETFAFindIn
 *
 */

  public void setInvsEquipmentTxnFieldAssoc(InvsEquipmentTxnFieldTablesObjectFilter IETFAFindInIn) {
    IETFAFindIn = IETFAFindInIn;
  }

  public void translateFromMap() {
    IETFAFindIn = InvsEquipmentTxnFieldTablesObjectHelper.fromMapFilter(inputMap, "InvsEquipmentTxnFieldAssoc");
  }

/**
 *
 * Gets the InvsEquipmentTxnFieldAssoc
 * @return Value of the InvsEquipmentTxnFieldAssoc
 *
 */

  public InvsEquipmentTxnFieldTablesObjectFilter getInvsEquipmentTxnFieldAssoc( ) {
    return IETFAFindIn;
  }

}
