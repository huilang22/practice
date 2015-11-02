/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPreconditionsGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipTxnPreconditionsGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipTxnPreconditionsGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipTxnPreconditionsObjectKeyData IETPGetIn;
/**
 *
 * Constructor to create a  InvsEquipTxnPreconditionsGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipTxnPreconditionsGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipTxnPreconditionsObjectKeyData IETPGetInIn) {
    super(id, context, "InvsEquipTxnPreconditionsGet");
    IETPGetIn = IETPGetInIn;
  }

  public void translateToMap() {
    if (IETPGetIn != null) {
      IETPGetIn.resetFlags(true, true);
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectKeyHelper.toMap(IETPGetIn, new HashMap(), "InvsEquipTxnPreconditionsObjectKeyData").get("InvsEquipTxnPreconditionsObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsEquipTxnPreconditions
 * @param IETPGetInIn Value of the IETPGetIn
 *
 */

  public void setInvsEquipTxnPreconditions(InvsEquipTxnPreconditionsObjectKeyData IETPGetInIn) {
    IETPGetIn = IETPGetInIn;
  }

  public void translateFromMap() {
    IETPGetIn = InvsEquipTxnPreconditionsObjectKeyHelper.fromMap(inputMap, "InvsEquipTxnPreconditions");
  }

/**
 *
 * Gets the InvsEquipTxnPreconditions
 * @return Value of the InvsEquipTxnPreconditions
 *
 */

  public InvsEquipTxnPreconditionsObjectKeyData getInvsEquipTxnPreconditions( ) {
    return IETPGetIn;
  }

}
