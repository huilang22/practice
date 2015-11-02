/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnFieldAssocGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentTxnFieldAssocGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentTxnFieldAssocGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentTxnFieldTablesObjectKeyData IETFAGetIn;
/**
 *
 * Constructor to create a  InvsEquipmentTxnFieldAssocGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentTxnFieldAssocGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentTxnFieldTablesObjectKeyData IETFAGetInIn) {
    super(id, context, "InvsEquipmentTxnFieldAssocGet");
    IETFAGetIn = IETFAGetInIn;
  }

  public void translateToMap() {
    if (IETFAGetIn != null) {
      IETFAGetIn.resetFlags(true, true);
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldTablesObjectKeyHelper.toMap(IETFAGetIn, new HashMap(), "InvsEquipmentTxnFieldTablesObjectKeyData").get("InvsEquipmentTxnFieldTablesObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsEquipmentTxnFieldAssoc
 * @param IETFAGetInIn Value of the IETFAGetIn
 *
 */

  public void setInvsEquipmentTxnFieldAssoc(InvsEquipmentTxnFieldTablesObjectKeyData IETFAGetInIn) {
    IETFAGetIn = IETFAGetInIn;
  }

  public void translateFromMap() {
    IETFAGetIn = InvsEquipmentTxnFieldTablesObjectKeyHelper.fromMap(inputMap, "InvsEquipmentTxnFieldAssoc");
  }

/**
 *
 * Gets the InvsEquipmentTxnFieldAssoc
 * @return Value of the InvsEquipmentTxnFieldAssoc
 *
 */

  public InvsEquipmentTxnFieldTablesObjectKeyData getInvsEquipmentTxnFieldAssoc( ) {
    return IETFAGetIn;
  }

}
