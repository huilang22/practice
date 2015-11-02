/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointIdCreateBulkUdtTemplateItem.java
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
 * Class used to create a BonusPointIdCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BonusPointIdCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BPIObjectData BPICreateIn;
/**
 *
 * Constructor to create a  BonusPointIdCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BonusPointIdCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BPIObjectData BPICreateInIn) {
    super(id, context, "BonusPointIdCreate");
    BPICreateIn = BPICreateInIn;
  }

  public void translateToMap() {
    if (BPICreateIn != null) {
      BPICreateIn.resetFlags(true, true);
      addInput("BonusPointId", BPIObjectHelper.toMap(BPICreateIn, new HashMap(), "BonusPointId").get("BonusPointId"));
    }
  }


/**
 *
 * Sets the BonusPointId
 * @param BPICreateInIn Value of the BPICreateIn
 *
 */

  public void setBonusPointId(BPIObjectData BPICreateInIn) {
    BPICreateIn = BPICreateInIn;
  }

  public void translateFromMap() {
    BPICreateIn = BPIObjectHelper.fromMap(inputMap, "BonusPointId");
  }

/**
 *
 * Gets the BonusPointId
 * @return Value of the BonusPointId
 *
 */

  public BPIObjectData getBonusPointId( ) {
    return BPICreateIn;
  }

}
