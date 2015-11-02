/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPostconditionsCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipTxnPostconditionsCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipTxnPostconditionsCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipTxnPostconditionsObjectData IETPCreateIn;
/**
 *
 * Constructor to create a  InvsEquipTxnPostconditionsCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipTxnPostconditionsCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipTxnPostconditionsObjectData IETPCreateInIn) {
    super(id, context, "InvsEquipTxnPostconditionsCreate");
    IETPCreateIn = IETPCreateInIn;
  }

  public void translateToMap() {
    if (IETPCreateIn != null) {
      IETPCreateIn.resetFlags(true, true);
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectHelper.toMap(IETPCreateIn, new HashMap(), "InvsEquipTxnPostconditions").get("InvsEquipTxnPostconditions"));
    }
  }


/**
 *
 * Sets the InvsEquipTxnPostconditions
 * @param IETPCreateInIn Value of the IETPCreateIn
 *
 */

  public void setInvsEquipTxnPostconditions(InvsEquipTxnPostconditionsObjectData IETPCreateInIn) {
    IETPCreateIn = IETPCreateInIn;
  }

  public void translateFromMap() {
    IETPCreateIn = InvsEquipTxnPostconditionsObjectHelper.fromMap(inputMap, "InvsEquipTxnPostconditions");
  }

/**
 *
 * Gets the InvsEquipTxnPostconditions
 * @return Value of the InvsEquipTxnPostconditions
 *
 */

  public InvsEquipTxnPostconditionsObjectData getInvsEquipTxnPostconditions( ) {
    return IETPCreateIn;
  }

}
