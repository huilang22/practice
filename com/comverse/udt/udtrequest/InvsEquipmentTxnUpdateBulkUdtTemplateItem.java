/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentTxnUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentTxnUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentTxnObjectData IETUpdateIn;
/**
 *
 * Constructor to create a  InvsEquipmentTxnUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentTxnUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentTxnObjectData IETUpdateInIn) {
    super(id, context, "InvsEquipmentTxnUpdate");
    IETUpdateIn = IETUpdateInIn;
  }

  public void translateToMap() {
    if (IETUpdateIn != null) {
      IETUpdateIn.resetFlags(true, true);
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectHelper.toMap(IETUpdateIn, new HashMap(), "InvsEquipmentTxn").get("InvsEquipmentTxn"));
    }
  }


/**
 *
 * Sets the InvsEquipmentTxn
 * @param IETUpdateInIn Value of the IETUpdateIn
 *
 */

  public void setInvsEquipmentTxn(InvsEquipmentTxnObjectData IETUpdateInIn) {
    IETUpdateIn = IETUpdateInIn;
  }

  public void translateFromMap() {
    IETUpdateIn = InvsEquipmentTxnObjectHelper.fromMap(inputMap, "InvsEquipmentTxn");
  }

/**
 *
 * Gets the InvsEquipmentTxn
 * @return Value of the InvsEquipmentTxn
 *
 */

  public InvsEquipmentTxnObjectData getInvsEquipmentTxn( ) {
    return IETUpdateIn;
  }

}
