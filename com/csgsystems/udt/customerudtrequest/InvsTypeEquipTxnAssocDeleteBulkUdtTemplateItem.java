/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeEquipTxnAssocDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvsTypeEquipTxnAssocDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypeEquipTxnAssocDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsTypeEquipTxnAssocObjectKeyData ITETADeleteIn;
/**
 *
 * Constructor to create a  InvsTypeEquipTxnAssocDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypeEquipTxnAssocDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypeEquipTxnAssocObjectKeyData ITETADeleteInIn) {
    super(id, context, "InvsTypeEquipTxnAssocDelete");
    ITETADeleteIn = ITETADeleteInIn;
  }

  public void translateToMap() {
    if (ITETADeleteIn != null) {
      ITETADeleteIn.resetFlags(true, true);
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnAssocObjectKeyHelper.toMap(ITETADeleteIn, new HashMap(), "InvsTypeEquipTxnAssocObjectKeyData").get("InvsTypeEquipTxnAssocObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsTypeEquipTxnAssoc
 * @param ITETADeleteInIn Value of the ITETADeleteIn
 *
 */

  public void setInvsTypeEquipTxnAssoc(InvsTypeEquipTxnAssocObjectKeyData ITETADeleteInIn) {
    ITETADeleteIn = ITETADeleteInIn;
  }

  public void translateFromMap() {
    ITETADeleteIn = InvsTypeEquipTxnAssocObjectKeyHelper.fromMap(inputMap, "InvsTypeEquipTxnAssoc");
  }

/**
 *
 * Gets the InvsTypeEquipTxnAssoc
 * @return Value of the InvsTypeEquipTxnAssoc
 *
 */

  public InvsTypeEquipTxnAssocObjectKeyData getInvsTypeEquipTxnAssoc( ) {
    return ITETADeleteIn;
  }

}
