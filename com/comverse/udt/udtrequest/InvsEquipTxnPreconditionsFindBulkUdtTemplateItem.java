/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPreconditionsFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipTxnPreconditionsFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipTxnPreconditionsFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipTxnPreconditionsObjectFilter IETPFindIn;
/**
 *
 * Constructor to create a  InvsEquipTxnPreconditionsFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipTxnPreconditionsFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipTxnPreconditionsObjectFilter IETPFindInIn) {
    super(id, context, "InvsEquipTxnPreconditionsFind");
    IETPFindIn = IETPFindInIn;
  }

  public void translateToMap() {
    if (IETPFindIn != null) {
      Integer index =  IETPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectHelper.toMap(IETPFindIn, new HashMap(), "InvsEquipTxnPreconditions").get("InvsEquipTxnPreconditions"));
    }
  }


/**
 *
 * Sets the InvsEquipTxnPreconditions
 * @param IETPFindInIn Value of the IETPFindIn
 *
 */

  public void setInvsEquipTxnPreconditions(InvsEquipTxnPreconditionsObjectFilter IETPFindInIn) {
    IETPFindIn = IETPFindInIn;
  }

  public void translateFromMap() {
    IETPFindIn = InvsEquipTxnPreconditionsObjectHelper.fromMapFilter(inputMap, "InvsEquipTxnPreconditions");
  }

/**
 *
 * Gets the InvsEquipTxnPreconditions
 * @return Value of the InvsEquipTxnPreconditions
 *
 */

  public InvsEquipTxnPreconditionsObjectFilter getInvsEquipTxnPreconditions( ) {
    return IETPFindIn;
  }

}
