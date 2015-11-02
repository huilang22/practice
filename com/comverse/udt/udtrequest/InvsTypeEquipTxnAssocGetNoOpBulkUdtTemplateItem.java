/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeEquipTxnAssocGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsTypeEquipTxnAssocGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsTypeEquipTxnAssocGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsTypeEquipTxnTablesObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsTypeEquipTxnAssocGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsTypeEquipTxnAssocGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypeEquipTxnTablesObjectData noOpInIn) {
    super(id, context, "InvsTypeEquipTxnAssocGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnTablesObjectHelper.toMap(noOpIn, new HashMap(), "InvsTypeEquipTxnAssoc").get("InvsTypeEquipTxnAssoc"));
    }
  }
/**
 *
 * Sets the  InvsTypeEquipTxnAssoc
 * @param noOpInIn InvsTypeEquipTxnTablesObjectData to set
 *
 */
  public void setInvsTypeEquipTxnAssoc(InvsTypeEquipTxnTablesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsTypeEquipTxnAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypeEquipTxnTablesObjectData getInvsTypeEquipTxnAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsTypeEquipTxnTablesObjectHelper.fromMap(inputMap, "InvsTypeEquipTxnAssoc");
  }
}
