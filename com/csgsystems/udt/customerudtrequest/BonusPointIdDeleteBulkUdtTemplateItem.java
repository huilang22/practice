/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointIdDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a BonusPointIdDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BonusPointIdDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BPIObjectKeyData BPIDeleteIn;
/**
 *
 * Constructor to create a  BonusPointIdDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BonusPointIdDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BPIObjectKeyData BPIDeleteInIn) {
    super(id, context, "BonusPointIdDelete");
    BPIDeleteIn = BPIDeleteInIn;
  }

  public void translateToMap() {
    if (BPIDeleteIn != null) {
      BPIDeleteIn.resetFlags(true, true);
      addInput("BonusPointId", BPIObjectKeyHelper.toMap(BPIDeleteIn, new HashMap(), "BPIObjectKeyData").get("BPIObjectKeyData"));
    }
  }


/**
 *
 * Sets the BonusPointId
 * @param BPIDeleteInIn Value of the BPIDeleteIn
 *
 */

  public void setBonusPointId(BPIObjectKeyData BPIDeleteInIn) {
    BPIDeleteIn = BPIDeleteInIn;
  }

  public void translateFromMap() {
    BPIDeleteIn = BPIObjectKeyHelper.fromMap(inputMap, "BonusPointId");
  }

/**
 *
 * Gets the BonusPointId
 * @return Value of the BonusPointId
 *
 */

  public BPIObjectKeyData getBonusPointId( ) {
    return BPIDeleteIn;
  }

}
