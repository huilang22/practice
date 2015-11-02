/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPostconditionsFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsEquipTxnPostconditionsFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsEquipTxnPostconditionsFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsEquipTxnPostconditionsObjectFilter IETPFindIn;
/**
 *
 * Constructor to create a  InvsEquipTxnPostconditionsFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsEquipTxnPostconditionsFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipTxnPostconditionsObjectFilter IETPFindInIn) {
    super(id, context, "InvsEquipTxnPostconditionsFind");
    IETPFindIn = IETPFindInIn;
  }

  public void translateToMap() {
    if (IETPFindIn != null) {
      Integer index =  IETPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectHelper.toMap(IETPFindIn, new HashMap(), "InvsEquipTxnPostconditions").get("InvsEquipTxnPostconditions"));
    }
  }


/**
 *
 * Sets the InvsEquipTxnPostconditions
 * @param IETPFindInIn Value of the IETPFindIn
 *
 */

  public void setInvsEquipTxnPostconditions(InvsEquipTxnPostconditionsObjectFilter IETPFindInIn) {
    IETPFindIn = IETPFindInIn;
  }

  public void translateFromMap() {
    IETPFindIn = InvsEquipTxnPostconditionsObjectHelper.fromMapFilter(inputMap, "InvsEquipTxnPostconditions");
  }

/**
 *
 * Gets the InvsEquipTxnPostconditions
 * @return Value of the InvsEquipTxnPostconditions
 *
 */

  public InvsEquipTxnPostconditionsObjectFilter getInvsEquipTxnPostconditions( ) {
    return IETPFindIn;
  }

}
