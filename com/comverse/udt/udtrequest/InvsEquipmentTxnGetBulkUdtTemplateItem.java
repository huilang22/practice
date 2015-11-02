/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipmentTxnGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipmentTxnGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipmentTxnObjectKeyData IETGetIn;
/**
 *
 * Constructor to create a  InvsEquipmentTxnGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipmentTxnGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentTxnObjectKeyData IETGetInIn) {
    super(id, context, "InvsEquipmentTxnGet");
    IETGetIn = IETGetInIn;
  }

  public void translateToMap() {
    if (IETGetIn != null) {
      IETGetIn.resetFlags(true, true);
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectKeyHelper.toMap(IETGetIn, new HashMap(), "InvsEquipmentTxnObjectKeyData").get("InvsEquipmentTxnObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsEquipmentTxn
 * @param IETGetInIn Value of the IETGetIn
 *
 */

  public void setInvsEquipmentTxn(InvsEquipmentTxnObjectKeyData IETGetInIn) {
    IETGetIn = IETGetInIn;
  }

  public void translateFromMap() {
    IETGetIn = InvsEquipmentTxnObjectKeyHelper.fromMap(inputMap, "InvsEquipmentTxn");
  }

/**
 *
 * Gets the InvsEquipmentTxn
 * @return Value of the InvsEquipmentTxn
 *
 */

  public InvsEquipmentTxnObjectKeyData getInvsEquipmentTxn( ) {
    return IETGetIn;
  }

}
