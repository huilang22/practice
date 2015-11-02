/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnFieldAssocUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentTxnFieldAssocUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentTxnFieldAssocUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentTxnFieldAssocObjectData IETFAUpdateIn;
/**
 *
 * Constructor to create a  InvsEquipmentTxnFieldAssocUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentTxnFieldAssocUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentTxnFieldAssocObjectData IETFAUpdateInIn) {
    super(id, context, "InvsEquipmentTxnFieldAssocUpdate");
    IETFAUpdateIn = IETFAUpdateInIn;
  }

  public void translateToMap() {
    if (IETFAUpdateIn != null) {
      IETFAUpdateIn.resetFlags(true, true);
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldAssocObjectHelper.toMap(IETFAUpdateIn, new HashMap(), "InvsEquipmentTxnFieldAssoc").get("InvsEquipmentTxnFieldAssoc"));
    }
  }


/**
 *
 * Sets the InvsEquipmentTxnFieldAssoc
 * @param IETFAUpdateInIn Value of the IETFAUpdateIn
 *
 */

  public void setInvsEquipmentTxnFieldAssoc(InvsEquipmentTxnFieldAssocObjectData IETFAUpdateInIn) {
    IETFAUpdateIn = IETFAUpdateInIn;
  }

  public void translateFromMap() {
    IETFAUpdateIn = InvsEquipmentTxnFieldAssocObjectHelper.fromMap(inputMap, "InvsEquipmentTxnFieldAssoc");
  }

/**
 *
 * Gets the InvsEquipmentTxnFieldAssoc
 * @return Value of the InvsEquipmentTxnFieldAssoc
 *
 */

  public InvsEquipmentTxnFieldAssocObjectData getInvsEquipmentTxnFieldAssoc( ) {
    return IETFAUpdateIn;
  }

}
