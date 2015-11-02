/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointTransTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a BonusPointTransTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BonusPointTransTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BonusPointTransTypeObjectKeyData BPTTGetIn;
/**
 *
 * Constructor to create a  BonusPointTransTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BonusPointTransTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BonusPointTransTypeObjectKeyData BPTTGetInIn) {
    super(id, context, "BonusPointTransTypeGet");
    BPTTGetIn = BPTTGetInIn;
  }

  public void translateToMap() {
    if (BPTTGetIn != null) {
      BPTTGetIn.resetFlags(true, true);
      addInput("BonusPointTransType", BonusPointTransTypeObjectKeyHelper.toMap(BPTTGetIn, new HashMap(), "BonusPointTransTypeObjectKeyData").get("BonusPointTransTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BonusPointTransType
 * @param BPTTGetInIn Value of the BPTTGetIn
 *
 */

  public void setBonusPointTransType(BonusPointTransTypeObjectKeyData BPTTGetInIn) {
    BPTTGetIn = BPTTGetInIn;
  }

  public void translateFromMap() {
    BPTTGetIn = BonusPointTransTypeObjectKeyHelper.fromMap(inputMap, "BonusPointTransType");
  }

/**
 *
 * Gets the BonusPointTransType
 * @return Value of the BonusPointTransType
 *
 */

  public BonusPointTransTypeObjectKeyData getBonusPointTransType( ) {
    return BPTTGetIn;
  }

}
