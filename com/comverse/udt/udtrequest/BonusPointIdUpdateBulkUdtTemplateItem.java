/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointIdUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a BonusPointIdUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BonusPointIdUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BPIObjectData BPIUpdateIn;
/**
 *
 * Constructor to create a  BonusPointIdUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BonusPointIdUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BPIObjectData BPIUpdateInIn) {
    super(id, context, "BonusPointIdUpdate");
    BPIUpdateIn = BPIUpdateInIn;
  }

  public void translateToMap() {
    if (BPIUpdateIn != null) {
      BPIUpdateIn.resetFlags(true, true);
      addInput("BonusPointId", BPIObjectHelper.toMap(BPIUpdateIn, new HashMap(), "BonusPointId").get("BonusPointId"));
    }
  }


/**
 *
 * Sets the BonusPointId
 * @param BPIUpdateInIn Value of the BPIUpdateIn
 *
 */

  public void setBonusPointId(BPIObjectData BPIUpdateInIn) {
    BPIUpdateIn = BPIUpdateInIn;
  }

  public void translateFromMap() {
    BPIUpdateIn = BPIObjectHelper.fromMap(inputMap, "BonusPointId");
  }

/**
 *
 * Gets the BonusPointId
 * @return Value of the BonusPointId
 *
 */

  public BPIObjectData getBonusPointId( ) {
    return BPIUpdateIn;
  }

}
