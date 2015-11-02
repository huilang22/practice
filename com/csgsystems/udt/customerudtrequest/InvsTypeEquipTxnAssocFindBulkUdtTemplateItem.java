/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeEquipTxnAssocFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a InvsTypeEquipTxnAssocFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypeEquipTxnAssocFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsTypeEquipTxnTablesObjectFilter ITETAFindIn;
/**
 *
 * Constructor to create a  InvsTypeEquipTxnAssocFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypeEquipTxnAssocFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypeEquipTxnTablesObjectFilter ITETAFindInIn) {
    super(id, context, "InvsTypeEquipTxnAssocFind");
    ITETAFindIn = ITETAFindInIn;
  }

  public void translateToMap() {
    if (ITETAFindIn != null) {
      Integer index =  ITETAFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnTablesObjectHelper.toMap(ITETAFindIn, new HashMap(), "InvsTypeEquipTxnAssoc").get("InvsTypeEquipTxnAssoc"));
    }
  }


/**
 *
 * Sets the InvsTypeEquipTxnAssoc
 * @param ITETAFindInIn Value of the ITETAFindIn
 *
 */

  public void setInvsTypeEquipTxnAssoc(InvsTypeEquipTxnTablesObjectFilter ITETAFindInIn) {
    ITETAFindIn = ITETAFindInIn;
  }

  public void translateFromMap() {
    ITETAFindIn = InvsTypeEquipTxnTablesObjectHelper.fromMapFilter(inputMap, "InvsTypeEquipTxnAssoc");
  }

/**
 *
 * Gets the InvsTypeEquipTxnAssoc
 * @return Value of the InvsTypeEquipTxnAssoc
 *
 */

  public InvsTypeEquipTxnTablesObjectFilter getInvsTypeEquipTxnAssoc( ) {
    return ITETAFindIn;
  }

}
