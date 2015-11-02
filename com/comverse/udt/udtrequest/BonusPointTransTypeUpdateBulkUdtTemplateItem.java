/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointTransTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BonusPointTransTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BonusPointTransTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BonusPointTransTypeObjectData BPTTUpdateIn;
/**
 *
 * Constructor to create a  BonusPointTransTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BonusPointTransTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BonusPointTransTypeObjectData BPTTUpdateInIn) {
    super(id, context, "BonusPointTransTypeUpdate");
    BPTTUpdateIn = BPTTUpdateInIn;
  }

  public void translateToMap() {
    if (BPTTUpdateIn != null) {
      BPTTUpdateIn.resetFlags(true, true);
      addInput("BonusPointTransType", BonusPointTransTypeObjectHelper.toMap(BPTTUpdateIn, new HashMap(), "BonusPointTransType").get("BonusPointTransType"));
    }
  }


/**
 *
 * Sets the BonusPointTransType
 * @param BPTTUpdateInIn Value of the BPTTUpdateIn
 *
 */

  public void setBonusPointTransType(BonusPointTransTypeObjectData BPTTUpdateInIn) {
    BPTTUpdateIn = BPTTUpdateInIn;
  }

  public void translateFromMap() {
    BPTTUpdateIn = BonusPointTransTypeObjectHelper.fromMap(inputMap, "BonusPointTransType");
  }

/**
 *
 * Gets the BonusPointTransType
 * @return Value of the BonusPointTransType
 *
 */

  public BonusPointTransTypeObjectData getBonusPointTransType( ) {
    return BPTTUpdateIn;
  }

}
