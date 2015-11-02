/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeEquipTxnAssocCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsTypeEquipTxnAssocCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsTypeEquipTxnAssocCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsTypeEquipTxnAssocObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsTypeEquipTxnAssocCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsTypeEquipTxnAssocCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypeEquipTxnAssocObjectData noOpInIn) {
    super(id, context, "InvsTypeEquipTxnAssocCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnAssocObjectHelper.toMap(noOpIn, new HashMap(), "InvsTypeEquipTxnAssoc").get("InvsTypeEquipTxnAssoc"));
    }
  }
/**
 *
 * Sets the  InvsTypeEquipTxnAssoc
 * @param noOpInIn InvsTypeEquipTxnAssocObjectData to set
 *
 */
  public void setInvsTypeEquipTxnAssoc(InvsTypeEquipTxnAssocObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsTypeEquipTxnAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypeEquipTxnAssocObjectData getInvsTypeEquipTxnAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsTypeEquipTxnAssocObjectHelper.fromMap(inputMap, "InvsTypeEquipTxnAssoc");
  }
}
