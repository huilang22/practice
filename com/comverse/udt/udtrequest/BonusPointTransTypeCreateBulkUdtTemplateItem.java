/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointTransTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a BonusPointTransTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BonusPointTransTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BonusPointTransTypeObjectData BPTTCreateIn;
/**
 *
 * Constructor to create a  BonusPointTransTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BonusPointTransTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BonusPointTransTypeObjectData BPTTCreateInIn) {
    super(id, context, "BonusPointTransTypeCreate");
    BPTTCreateIn = BPTTCreateInIn;
  }

  public void translateToMap() {
    if (BPTTCreateIn != null) {
      BPTTCreateIn.resetFlags(true, true);
      addInput("BonusPointTransType", BonusPointTransTypeObjectHelper.toMap(BPTTCreateIn, new HashMap(), "BonusPointTransType").get("BonusPointTransType"));
    }
  }


/**
 *
 * Sets the BonusPointTransType
 * @param BPTTCreateInIn Value of the BPTTCreateIn
 *
 */

  public void setBonusPointTransType(BonusPointTransTypeObjectData BPTTCreateInIn) {
    BPTTCreateIn = BPTTCreateInIn;
  }

  public void translateFromMap() {
    BPTTCreateIn = BonusPointTransTypeObjectHelper.fromMap(inputMap, "BonusPointTransType");
  }

/**
 *
 * Gets the BonusPointTransType
 * @return Value of the BonusPointTransType
 *
 */

  public BonusPointTransTypeObjectData getBonusPointTransType( ) {
    return BPTTCreateIn;
  }

}
