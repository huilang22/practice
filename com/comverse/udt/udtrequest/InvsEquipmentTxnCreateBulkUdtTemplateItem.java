/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentTxnCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentTxnCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentTxnObjectData IETCreateIn;
/**
 *
 * Constructor to create a  InvsEquipmentTxnCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentTxnCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentTxnObjectData IETCreateInIn) {
    super(id, context, "InvsEquipmentTxnCreate");
    IETCreateIn = IETCreateInIn;
  }

  public void translateToMap() {
    if (IETCreateIn != null) {
      IETCreateIn.resetFlags(true, true);
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectHelper.toMap(IETCreateIn, new HashMap(), "InvsEquipmentTxn").get("InvsEquipmentTxn"));
    }
  }


/**
 *
 * Sets the InvsEquipmentTxn
 * @param IETCreateInIn Value of the IETCreateIn
 *
 */

  public void setInvsEquipmentTxn(InvsEquipmentTxnObjectData IETCreateInIn) {
    IETCreateIn = IETCreateInIn;
  }

  public void translateFromMap() {
    IETCreateIn = InvsEquipmentTxnObjectHelper.fromMap(inputMap, "InvsEquipmentTxn");
  }

/**
 *
 * Gets the InvsEquipmentTxn
 * @return Value of the InvsEquipmentTxn
 *
 */

  public InvsEquipmentTxnObjectData getInvsEquipmentTxn( ) {
    return IETCreateIn;
  }

}
