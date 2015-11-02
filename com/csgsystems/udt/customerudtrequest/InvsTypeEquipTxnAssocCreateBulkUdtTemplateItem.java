/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeEquipTxnAssocCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsTypeEquipTxnAssocCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypeEquipTxnAssocCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsTypeEquipTxnAssocObjectData ITETACreateIn;
/**
 *
 * Constructor to create a  InvsTypeEquipTxnAssocCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypeEquipTxnAssocCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypeEquipTxnAssocObjectData ITETACreateInIn) {
    super(id, context, "InvsTypeEquipTxnAssocCreate");
    ITETACreateIn = ITETACreateInIn;
  }

  public void translateToMap() {
    if (ITETACreateIn != null) {
      ITETACreateIn.resetFlags(true, true);
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnAssocObjectHelper.toMap(ITETACreateIn, new HashMap(), "InvsTypeEquipTxnAssoc").get("InvsTypeEquipTxnAssoc"));
    }
  }


/**
 *
 * Sets the InvsTypeEquipTxnAssoc
 * @param ITETACreateInIn Value of the ITETACreateIn
 *
 */

  public void setInvsTypeEquipTxnAssoc(InvsTypeEquipTxnAssocObjectData ITETACreateInIn) {
    ITETACreateIn = ITETACreateInIn;
  }

  public void translateFromMap() {
    ITETACreateIn = InvsTypeEquipTxnAssocObjectHelper.fromMap(inputMap, "InvsTypeEquipTxnAssoc");
  }

/**
 *
 * Gets the InvsTypeEquipTxnAssoc
 * @return Value of the InvsTypeEquipTxnAssoc
 *
 */

  public InvsTypeEquipTxnAssocObjectData getInvsTypeEquipTxnAssoc( ) {
    return ITETACreateIn;
  }

}
