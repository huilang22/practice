/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeEquipTxnAssocGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsTypeEquipTxnAssocGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypeEquipTxnAssocGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsTypeEquipTxnTablesObjectKeyData ITETAGetIn;
/**
 *
 * Constructor to create a  InvsTypeEquipTxnAssocGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypeEquipTxnAssocGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypeEquipTxnTablesObjectKeyData ITETAGetInIn) {
    super(id, context, "InvsTypeEquipTxnAssocGet");
    ITETAGetIn = ITETAGetInIn;
  }

  public void translateToMap() {
    if (ITETAGetIn != null) {
      ITETAGetIn.resetFlags(true, true);
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnTablesObjectKeyHelper.toMap(ITETAGetIn, new HashMap(), "InvsTypeEquipTxnTablesObjectKeyData").get("InvsTypeEquipTxnTablesObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsTypeEquipTxnAssoc
 * @param ITETAGetInIn Value of the ITETAGetIn
 *
 */

  public void setInvsTypeEquipTxnAssoc(InvsTypeEquipTxnTablesObjectKeyData ITETAGetInIn) {
    ITETAGetIn = ITETAGetInIn;
  }

  public void translateFromMap() {
    ITETAGetIn = InvsTypeEquipTxnTablesObjectKeyHelper.fromMap(inputMap, "InvsTypeEquipTxnAssoc");
  }

/**
 *
 * Gets the InvsTypeEquipTxnAssoc
 * @return Value of the InvsTypeEquipTxnAssoc
 *
 */

  public InvsTypeEquipTxnTablesObjectKeyData getInvsTypeEquipTxnAssoc( ) {
    return ITETAGetIn;
  }

}
