/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointIdGetBulkUdtTemplateItem.java
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
 * Class used to create a BonusPointIdGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BonusPointIdGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BPIObjectKeyData BPIGetIn;
/**
 *
 * Constructor to create a  BonusPointIdGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BonusPointIdGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BPIObjectKeyData BPIGetInIn) {
    super(id, context, "BonusPointIdGet");
    BPIGetIn = BPIGetInIn;
  }

  public void translateToMap() {
    if (BPIGetIn != null) {
      BPIGetIn.resetFlags(true, true);
      addInput("BonusPointId", BPIObjectKeyHelper.toMap(BPIGetIn, new HashMap(), "BPIObjectKeyData").get("BPIObjectKeyData"));
    }
  }


/**
 *
 * Sets the BonusPointId
 * @param BPIGetInIn Value of the BPIGetIn
 *
 */

  public void setBonusPointId(BPIObjectKeyData BPIGetInIn) {
    BPIGetIn = BPIGetInIn;
  }

  public void translateFromMap() {
    BPIGetIn = BPIObjectKeyHelper.fromMap(inputMap, "BonusPointId");
  }

/**
 *
 * Gets the BonusPointId
 * @return Value of the BonusPointId
 *
 */

  public BPIObjectKeyData getBonusPointId( ) {
    return BPIGetIn;
  }

}
