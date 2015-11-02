/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPostconditionsDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipTxnPostconditionsDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipTxnPostconditionsDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipTxnPostconditionsObjectKeyData IETPDeleteIn;
/**
 *
 * Constructor to create a  InvsEquipTxnPostconditionsDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipTxnPostconditionsDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipTxnPostconditionsObjectKeyData IETPDeleteInIn) {
    super(id, context, "InvsEquipTxnPostconditionsDelete");
    IETPDeleteIn = IETPDeleteInIn;
  }

  public void translateToMap() {
    if (IETPDeleteIn != null) {
      IETPDeleteIn.resetFlags(true, true);
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectKeyHelper.toMap(IETPDeleteIn, new HashMap(), "InvsEquipTxnPostconditionsObjectKeyData").get("InvsEquipTxnPostconditionsObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsEquipTxnPostconditions
 * @param IETPDeleteInIn Value of the IETPDeleteIn
 *
 */

  public void setInvsEquipTxnPostconditions(InvsEquipTxnPostconditionsObjectKeyData IETPDeleteInIn) {
    IETPDeleteIn = IETPDeleteInIn;
  }

  public void translateFromMap() {
    IETPDeleteIn = InvsEquipTxnPostconditionsObjectKeyHelper.fromMap(inputMap, "InvsEquipTxnPostconditions");
  }

/**
 *
 * Gets the InvsEquipTxnPostconditions
 * @return Value of the InvsEquipTxnPostconditions
 *
 */

  public InvsEquipTxnPostconditionsObjectKeyData getInvsEquipTxnPostconditions( ) {
    return IETPDeleteIn;
  }

}
