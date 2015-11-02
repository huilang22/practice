/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointTransTypeDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a BonusPointTransTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BonusPointTransTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BonusPointTransTypeObjectKeyData BPTTDeleteIn;
/**
 *
 * Constructor to create a  BonusPointTransTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BonusPointTransTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BonusPointTransTypeObjectKeyData BPTTDeleteInIn) {
    super(id, context, "BonusPointTransTypeDelete");
    BPTTDeleteIn = BPTTDeleteInIn;
  }

  public void translateToMap() {
    if (BPTTDeleteIn != null) {
      BPTTDeleteIn.resetFlags(true, true);
      addInput("BonusPointTransType", BonusPointTransTypeObjectKeyHelper.toMap(BPTTDeleteIn, new HashMap(), "BonusPointTransTypeObjectKeyData").get("BonusPointTransTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BonusPointTransType
 * @param BPTTDeleteInIn Value of the BPTTDeleteIn
 *
 */

  public void setBonusPointTransType(BonusPointTransTypeObjectKeyData BPTTDeleteInIn) {
    BPTTDeleteIn = BPTTDeleteInIn;
  }

  public void translateFromMap() {
    BPTTDeleteIn = BonusPointTransTypeObjectKeyHelper.fromMap(inputMap, "BonusPointTransType");
  }

/**
 *
 * Gets the BonusPointTransType
 * @return Value of the BonusPointTransType
 *
 */

  public BonusPointTransTypeObjectKeyData getBonusPointTransType( ) {
    return BPTTDeleteIn;
  }

}
