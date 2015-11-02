/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPostconditionsGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipTxnPostconditionsGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipTxnPostconditionsGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipTxnPostconditionsObjectKeyData IETPGetIn;
/**
 *
 * Constructor to create a  InvsEquipTxnPostconditionsGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipTxnPostconditionsGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipTxnPostconditionsObjectKeyData IETPGetInIn) {
    super(id, context, "InvsEquipTxnPostconditionsGet");
    IETPGetIn = IETPGetInIn;
  }

  public void translateToMap() {
    if (IETPGetIn != null) {
      IETPGetIn.resetFlags(true, true);
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectKeyHelper.toMap(IETPGetIn, new HashMap(), "InvsEquipTxnPostconditionsObjectKeyData").get("InvsEquipTxnPostconditionsObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsEquipTxnPostconditions
 * @param IETPGetInIn Value of the IETPGetIn
 *
 */

  public void setInvsEquipTxnPostconditions(InvsEquipTxnPostconditionsObjectKeyData IETPGetInIn) {
    IETPGetIn = IETPGetInIn;
  }

  public void translateFromMap() {
    IETPGetIn = InvsEquipTxnPostconditionsObjectKeyHelper.fromMap(inputMap, "InvsEquipTxnPostconditions");
  }

/**
 *
 * Gets the InvsEquipTxnPostconditions
 * @return Value of the InvsEquipTxnPostconditions
 *
 */

  public InvsEquipTxnPostconditionsObjectKeyData getInvsEquipTxnPostconditions( ) {
    return IETPGetIn;
  }

}
