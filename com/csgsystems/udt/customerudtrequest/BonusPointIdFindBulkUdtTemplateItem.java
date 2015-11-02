/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointIdFindBulkUdtTemplateItem.java
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
 * Class used to create a BonusPointIdFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BonusPointIdFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BPIObjectFilter BPIFindIn;
/**
 *
 * Constructor to create a  BonusPointIdFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BonusPointIdFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BPIObjectFilter BPIFindInIn) {
    super(id, context, "BonusPointIdFind");
    BPIFindIn = BPIFindInIn;
  }

  public void translateToMap() {
    if (BPIFindIn != null) {
      Integer index =  BPIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BonusPointId", BPIObjectHelper.toMap(BPIFindIn, new HashMap(), "BonusPointId").get("BonusPointId"));
    }
  }


/**
 *
 * Sets the BonusPointId
 * @param BPIFindInIn Value of the BPIFindIn
 *
 */

  public void setBonusPointId(BPIObjectFilter BPIFindInIn) {
    BPIFindIn = BPIFindInIn;
  }

  public void translateFromMap() {
    BPIFindIn = BPIObjectHelper.fromMapFilter(inputMap, "BonusPointId");
  }

/**
 *
 * Gets the BonusPointId
 * @return Value of the BonusPointId
 *
 */

  public BPIObjectFilter getBonusPointId( ) {
    return BPIFindIn;
  }

}
